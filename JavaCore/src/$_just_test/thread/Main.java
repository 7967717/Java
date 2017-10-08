package $_just_test.thread;

import java.util.logging.Logger;

/**
 * Created by RomanR on 4/28/14.
 */
public class Main {

    private static final Logger LOGGER = Logger.getLogger("rootLogger");

    public static void main(String[] args) throws InterruptedException {
        Thread thread;
        IndexProcessor runnable = new IndexProcessor();

        thread = new Thread(runnable);
        LOGGER.info("Starting thread: " + thread);
        thread.start();
        LOGGER.info("Background process successfully started.");

        LOGGER.info("Stopping thread: " + thread);
        if (thread != null) {
            runnable.terminate();
            thread.join();
            LOGGER.info("Thread successfully stopped.");

        }
    }
}
