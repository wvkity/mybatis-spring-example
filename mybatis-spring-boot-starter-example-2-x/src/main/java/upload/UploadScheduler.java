package upload;

public interface UploadScheduler<T extends Task> {

    /**
     * 开启
     * @return {@link UploadScheduler}
     */
    UploadScheduler<T> start();

    /**
     * 添加任务
     * @param task 任务
     * @return {@code this}
     */
    UploadScheduler<T> addTask(final T task);

    /**
     * 获取当前状态
     * @return 状态
     */
    Status getStatus();

    /**
     * 是否在运行中
     * @return boolean
     */
    default boolean isRunning() {
        return getStatus() == Status.RUNNING;
    }

    /**
     * 是否暂停
     * @return boolean
     */
    default boolean isPause() {
        return getStatus() == Status.PAUSE;
    }

    /**
     * 是否终止
     * @return boolean
     */
    default boolean isShutdown() {
        return getStatus() == Status.SHUTDOWN;
    }
}
