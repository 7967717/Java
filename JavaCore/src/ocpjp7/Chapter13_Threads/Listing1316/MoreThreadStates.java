package ocpjp7.Chapter13_Threads.Listing1316;


/*ocpjp7*/



// The class creates two threads to show how to these threads will enter into 
// TIMED_WAITING and BLOCKED states 
class MoreThreadStates {
    public static void main(String[] s) throws InterruptedException {
        Thread t1 = new SleepyThread();
        Thread t2 = new SleepyThread();
        t1.start();
        t2.start();
        Thread.sleep(500);
        System.out.println(t1.getName() + ": I'm in state " + t1.getState());
        System.out.println(t2.getName() + ": I'm in state " + t2.getState());
    }
} 