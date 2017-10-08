package ocpjp7.Chapter14_Concurrency.Listing1415;
/*ocpjp7*/


import java.util.concurrent.ThreadFactory;

class TestThreadFactory {
    public static void main(String[] args) {
        ThreadFactory threadFactory = new MaxPriorityThreadFactory();
        Thread t1 = threadFactory.newThread(new ARunnable());
        System.out.println("The name of the thread is " + t1.getName());
        System.out.println("The priority of the thread is " + t1.getPriority());
        t1.start();
    }
}  