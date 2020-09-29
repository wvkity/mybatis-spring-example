package com.wvkity.mybatis.example.junit.thread;

import org.junit.platform.commons.util.StringUtils;

import javax.servlet.Filter;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class CacheThread {

    private static final Map<String, InnerQueue> CACHE = new ConcurrentHashMap<>();
    
    static class InnerQueue {
        private final Lock LOCK = new ReentrantLock();
        private final Condition notEmpty = LOCK.newCondition();
        private final PriorityBlockingQueue<String> queue;
        private final String key;
        public InnerQueue(String key) {
            queue = new PriorityBlockingQueue<>(64);
            this.key = key;
        }
        
        public void add(final String value) {
            if (value != null) {
                final Lock lock = this.LOCK;
                lock.lock();
                try {
                    this.queue.add(value);
                    this.notEmpty.signal();
                } finally {
                    lock.unlock();
                }
            }
        }
        
        public void addAll(final List<String> values) {
            if (values != null) {
                final Lock lock = this.LOCK;
                lock.lock();
                try {
                    this.queue.addAll(values.stream().filter(Objects::nonNull).collect(Collectors.toList()));
                    this.notEmpty.signal();
                } finally {
                    lock.unlock();
                }
            }
        }
        
        public String take() throws InterruptedException {
            final Lock lock = this.LOCK;
            lock.lockInterruptibly();
            try {
                Thread.sleep(1000);
                return this.queue.take();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void add(final String key, final String value) {
        if (StringUtils.isNotBlank(key) && StringUtils.isNotBlank(value)) {
            InnerQueue queue = CACHE.get(key);
            if (queue != null) {
                queue.add(value);
            } else {
                final InnerQueue newQueue = new InnerQueue(key);
                newQueue.add(value);
                final InnerQueue old = CACHE.putIfAbsent(key, newQueue);
                if (old != null) {
                    old.add(value);
                }
            }
        }
    }

    public static void add(final String key, final List<String> values) {
        if (StringUtils.isNotBlank(key) && values != null && !values.isEmpty()) {
            InnerQueue queue = CACHE.get(key);
            if (queue != null) {
                queue.addAll(values);
            } else {
                final InnerQueue newQueue = new InnerQueue(key);
                newQueue.addAll(values);
                final InnerQueue old = CACHE.putIfAbsent(key, newQueue);
                if (old != null) {
                    old.addAll(values);
                }
            }
        }
    }
    
    public static String take(final String key) throws InterruptedException {
        synchronized (key) {
            InnerQueue queue = CACHE.get(key);
            return queue.take();
        }
    }
    
    static class QueueExecutorService {
        private final String key;
        private final int executorThread;
        private final ExecutorService executorService;

        public QueueExecutorService(String key, int executorThread) {
            this(key, executorThread, null);
        }

        public QueueExecutorService(String key, int executorThread, ExecutorService executorService) {
            this.key = key;
            this.executorThread = executorThread <= 0 ? 5 : executorThread;
            if (executorService ==null) {
                this.executorService = Executors.newCachedThreadPool(Executors.defaultThreadFactory());
            } else {
                this.executorService = executorService;
            }
        }
        
        public void start() {
            for (int i = 0; i < executorThread; i++) {
                this.executorService.execute(new QueueExecutor(this.key));
            }
        }
    }
    
    static class QueueExecutor implements Runnable {

        private final String key;
        private final InnerQueue queue;

        public QueueExecutor(String key) {
            this.key = key;
            this.queue = CACHE.get(key);
        }

        @Override
        public void run() {
            try {
                while (true) {
                    String value = queue.take();
                    System.out.println(Thread.currentThread().getName() + ": " + this.key + " -- 值为: " + value);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            /*String admin = "admin";
            String root = "root";
            int j = 100;
            for (int i = 0; i < 25; i++) {
                add(root, root + ++j);
                add(admin, admin + ++j);
            }
            QueueExecutorService qes1 = new QueueExecutorService(admin, 5);
            QueueExecutorService qes2 = new QueueExecutorService(root, 6);
            qes1.start();
            qes2.start();
            for (int i = 0; i< 30; i++) {
                add(admin, admin + i);
                //Thread.sleep(300);
            }
            for (int i = 0; i < 30; i++ ) {
                add(root, root + i);
                //Thread.sleep(500);
            }*/
            //rootTask();
            //adminTask();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static void rootTask() {
        try {
            System.out.println("我是 root");
            while (true) {
                System.out.println(take("root"));
                //System.out.println(take("admin"));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    static void adminTask() {
        try {
            System.out.println("我是admin");
            while (true) {
                System.out.println(take("admin"));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
