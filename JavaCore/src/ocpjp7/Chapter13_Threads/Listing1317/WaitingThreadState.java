package ocpjp7.Chapter13_Threads.Listing1317;


/*ocpjp7*/



class WaitingThreadState {
    public static void main(String[] s) throws InterruptedException {
        Thread t = new InfiniteWaitThread();
        t.start();
        Thread.sleep(100);
        System.out.println(t.getName() + ": I'm in state " + t.getState());
    }
}
