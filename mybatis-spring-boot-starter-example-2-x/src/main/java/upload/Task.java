package upload;

public interface Task<V> extends Runnable {

    /**
     * 获取唯一标识
     * @return 标识
     */
    String unique();

    /**
     * 执行方法
     * @return 运行
     */
    V execute();

    @Override
    default void run() {
        execute();
    }
}
