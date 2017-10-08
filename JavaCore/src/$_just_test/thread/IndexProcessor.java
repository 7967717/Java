package $_just_test.thread;

import java.util.logging.Logger;

/**
 * Created by RomanR on 4/28/14.
 */
public class IndexProcessor implements Runnable {

    private static final Logger LOGGER = Logger.getLogger("rootLogger");
    private volatile boolean running = true;

    public void terminate() {
        running = false;
    }

    @Override
    public void run() {
        LOGGER.info(String.valueOf(running));
        while (running) {
            try {
                LOGGER.info("Sleeping...");
                Thread.sleep((long) 15000);

                LOGGER.info("Processing");
            } catch (InterruptedException e) {
                LOGGER.info("Exception");
                running = false;
            }
        }

    }
}
