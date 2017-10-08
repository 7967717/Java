package ocpjp7.Chapter14_Concurrency.Listing1415;
/*ocpjp7*/


import java.util.concurrent.*;

// A ThreadFactory implementation that sets the thread priority to max 
// for all the threads it creates 
class MaxPriorityThreadFactory implements ThreadFactory {
    private static long count = 0;

    public Thread newThread(Runnable r) {
        Thread temp = new Thread(r);
        temp.setName("prioritythread" + count++);
        temp.setPriority(Thread.MAX_PRIORITY);
        return temp;
    }
} 

