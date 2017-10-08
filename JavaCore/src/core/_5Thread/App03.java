package core._5Thread;

/**
 * Created by RomanR on 03-Jun-14.
 */
public class App03 {
    public static void main(String[] args) {
        final OneBuffer oneBuffer = new OneBuffer();

        new Thread(new Producer(oneBuffer, 10)).start();
        new Thread(new Producer(oneBuffer, 20)).start();
        new Thread(new Producer(oneBuffer, 30)).start();
        new Thread(new Consumer(oneBuffer)).start();


    }
}


class OneBuffer {
    private Integer elem = null;

    public synchronized void put(int elem) throws InterruptedException {
        while (this.elem != null) {
            this.wait();
        }
        this.elem = elem;
        this.notifyAll();
    }

    public synchronized int get() throws InterruptedException {
        while (elem == null) {
            this.wait();
        }
        int temp = elem;
        elem = null;
        this.notifyAll();
        return temp;
    }
}

class Producer implements Runnable{
    private OneBuffer buffer;
    private int i;

    Producer(OneBuffer buffer, int i) {
        this.buffer = buffer;
        this.i = i;
    }

    @Override
    public void run() {
        while (true){
            try {
//                System.out.println("Go to Put " + i);
                buffer.put(i++);
                System.out.println("Produced " + (i-1));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Consumer implements Runnable{
    private OneBuffer buffer;
    private int i;

    Consumer (OneBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true){
            try {
                i = buffer.get();
                System.out.println("Consumed " + i);
//                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
