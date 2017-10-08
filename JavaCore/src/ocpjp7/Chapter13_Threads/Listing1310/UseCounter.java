
/*ocpjp7*/



package ocpjp7.Chapter13_Threads.Listing1310;

class UseCounter implements Runnable {
    public static synchronized void increment() {
        Counter.count++;
        System.out.print(Counter.count + "  ");
    }

    public void run() {
        increment();
        increment();
        increment();
    }
}
