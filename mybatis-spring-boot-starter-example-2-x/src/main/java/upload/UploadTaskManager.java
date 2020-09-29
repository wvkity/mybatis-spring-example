package upload;


import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 文件上传任务管理器
 * @param <T> 泛型类型
 */
public class UploadTaskManager<T extends Task> implements UploadScheduler<T> {

    /**
     * 线程池前缀
     */
    private final String threadPattern;
    /**
     * 本地缓存
     */
    private final Map<String, T> localCache;
    /**
     * 线程池
     */
    private final ExecutorService threadPool;
    /**
     * 状态
     */
    private Status status = Status.WAITING;
    /**
     * 等待任务(任务管理器未开始或暂停时，临时缓存)
     */
    private Map<String, T> waitingTask = new ConcurrentHashMap<>();

    public UploadTaskManager(String threadPattern) {
        this.threadPool = Executors.newCachedThreadPool(new BasicThreadFactory.Builder()
                .namingPattern(threadPattern + "-thread-%d").daemon(true).build());
        this.threadPattern = threadPattern;
        this.localCache = new ConcurrentHashMap<>();
    }

    @Override
    public UploadTaskManager<T> start() {
        if (this.status == Status.WAITING) {
            this.status = Status.RUNNING;
            this.clearWaitingTask();
        } else if (this.status == Status.PAUSE) {
            this.status = Status.RUNNING;
            this.clearWaitingTask();
        }
        return this;
    }

    @Override
    public UploadTaskManager<T> addTask(T task) {
        if (this.isShutdown()) {
            throw new RuntimeException("线程池已终止.");
        } else if (this.isRunning()) {
            this.threadPool.submit(task);
        } else {
            // 添加到等待任务中
            this.waitingTask.putIfAbsent(task.unique(), task);
        }
        return this;
    }
    
    private void submit(final T task) {
        if (task != null) {
            this.threadPool.submit(task);
        }
    }
    
    private void clearWaitingTask() {
        if (!this.waitingTask.isEmpty()) {
            
        }
    }

    @Override
    public Status getStatus() {
        return this.status;
    }
}
