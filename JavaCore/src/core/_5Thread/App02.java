package core._5Thread;

import static java.lang.System.currentTimeMillis;

/**
 * Created by RomanR on 03-Jun-14.
 */
public class App02 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            final int finalI = i;
            new Thread( new Runnable() {
                @Override
                public void run() {
                    try {
                        work(finalI);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    private static synchronized void work(int i) throws InterruptedException {
        System.out.println(i + "     go wait " + currentTimeMillis());
        App02.class.wait(5000);
//        Thread.sleep(5000);
        System.out.println(i + "    go sleep " + currentTimeMillis());
        Thread.sleep(5000);
        System.out.println(i + " after sleep " + currentTimeMillis());
    }
}
