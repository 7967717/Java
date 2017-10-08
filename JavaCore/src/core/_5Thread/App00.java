package core._5Thread;

/**
 * Created by RomanR on 02-Jun-14.
 */
public class App00 {
    public static void main(String[] args) throws InterruptedException {
        final Thread mainThread = Thread.currentThread();

        Thread runThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread() + " runThread1");
                }
//                try {
//                    mainThread.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread() + " runThread1 finished");
            }
        });

        Thread runThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread() + " runThread2");
                }
                System.out.println(Thread.currentThread() + " runThread2 finished");
            }
        });

        runThread1.start();
        runThread2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread() + " runMain");
        }
        runThread1.join();
        runThread2.join();
        System.out.println(Thread.currentThread() + " all finished");
    }
}
