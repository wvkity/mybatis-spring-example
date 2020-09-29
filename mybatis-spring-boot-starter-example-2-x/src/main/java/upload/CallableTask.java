package upload;

import java.util.concurrent.Callable;

public interface CallableTask<V> extends Task<V>, Callable<V> {

    @Override
    default V call() throws Exception {
        return execute();
    }

    @Override
    default void run() {
        // ignore
    }
}
