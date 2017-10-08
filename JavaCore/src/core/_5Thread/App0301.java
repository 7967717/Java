package core._5Thread;

/**
 * @author roman.rudenko on 10-Mar-16.
 */
public class App0301 {
    public static void main(String[] args) {
        OneBuffer01 buffer = new OneBuffer01(true);
        final Consumer01 consumer1 = new Consumer01(buffer);
        final Consumer01 consumer2 = new Consumer01(buffer);
        final Consumer01 consumer3 = new Consumer01(buffer);
        final Producer01 producer1 = new Producer01(buffer);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true){
//                    if(producer1.getCounter() == 100) {
//                        producer1.stop();
//                    }
//                }
//            }
//        }).start();

        final Thread thread1 = new Thread(consumer1);
        thread1.start();
        final Thread thread2 = new Thread(consumer2);
        thread2.start();
        final Thread thread3 = new Thread(consumer3);
        thread3.start();
        final Thread thread4 = new Thread(producer1);
        thread4.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    if(consumer1.getCounter() == 1) {
                        thread1.interrupt();
                    }
                    if(consumer2.getCounter() == 2) {
                        thread2.interrupt();
                    }
                    if(consumer3.getCounter() == 3) {
                        thread3.interrupt();
                    }
                    if(producer1.getCounter() == 10) {
                        thread4.interrupt();
                    }
                }
            }
        }).start();

        Thread.currentThread().interrupt();
    }
}

class OneBuffer01 {
    private boolean empty;

    public OneBuffer01(boolean empty) {
        this.empty = empty;
    }

    public synchronized void put() throws InterruptedException {
        while (!empty) {
            wait(2000);
            System.out.println(Thread.currentThread().getName() + " -- " + "in wait");
        }
        empty = false;
        System.out.println(Thread.currentThread().getName() + " -- " + "put");
        notifyAll();
    }

    public synchronized void get() throws InterruptedException {
        while (empty) {
            wait(2000);
            System.out.println(Thread.currentThread().getName() + " -- " + "in wait");
        }
        empty = true;
        System.out.println(Thread.currentThread().getName() + " -- " + "get");
        notifyAll();
    }
}

class Consumer01 implements Runnable {

    private OneBuffer01 buffer;
    private int counter = 0;
//    private volatile boolean stop = false;

    public Consumer01(OneBuffer01 buffer) {
        this.buffer = buffer;
    }

//    public void stop(){
//        this.stop = true;
//    }

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                buffer.get();
                System.out.println(Thread.currentThread().getName() + " got ----------------- " + ++counter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Producer01 implements Runnable {

    private OneBuffer01 buffer;
    private int counter = 0;
//    private volatile boolean stop = false;

    public Producer01(OneBuffer01 buffer) {
        this.buffer = buffer;
    }

//    public void stop(){
//        this.stop = true;
//    }

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                buffer.put();
                System.out.println(Thread.currentThread().getName() + " produced ------- " + ++counter);
                Thread.sleep(1000);
                if(counter == 10) {Thread.currentThread().interrupt();}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
