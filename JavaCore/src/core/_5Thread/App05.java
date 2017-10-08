package core._5Thread;

/**
 * @author Roman Rudenko on 18-Mar-15.
 */
public class App05 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " - " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
        System.out.println(Thread.currentThread() + " before join");
//        thread.interrupt();
        thread.join();
        System.out.println(Thread.currentThread() + " after join");

    }
}
