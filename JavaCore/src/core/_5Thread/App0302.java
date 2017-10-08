package core._5Thread;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author roman.rudenko on 15-Jul-16.
 */
public class App0302 {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> buffer = new PriorityBlockingQueue<>();
        final Consumer02 consumer1 = new Consumer02(buffer);
        final Consumer02 consumer2 = new Consumer02(buffer);
        final Consumer02 consumer3 = new Consumer02(buffer);
        final Producer02 producer1 = new Producer02(buffer);

//        final Thread thread1 = new Thread(consumer1);
//        thread1.start();
//        final Thread thread2 = new Thread(consumer2);
//        thread2.start();
        final Thread thread3 = new Thread(consumer3);
        thread3.start();
        final Thread thread4 = new Thread(producer1);
        thread4.start();
    }

}

class Consumer02 implements Runnable {

    final PriorityBlockingQueue<Integer> buffer;

    public Consumer02(PriorityBlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (!Producer02.stop) {
            try {
                int counter = buffer.take();
                System.out.println(Thread.currentThread().getName() + " got ----------------- " + counter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Producer02 implements Runnable {

    final PriorityBlockingQueue<Integer> buffer;
    private int counter = 0;
    public static volatile boolean stop = false;

    public Producer02(PriorityBlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }

    private void stop(){
        this.stop = true;
    }

    @Override
    public void run() {
        while (!stop) {
            try {
                buffer.put(counter);
                System.out.println(Thread.currentThread().getName() + " produced ------- " + counter++);
                Thread.sleep(1000);
                if (counter == 10) {
                    stop();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
