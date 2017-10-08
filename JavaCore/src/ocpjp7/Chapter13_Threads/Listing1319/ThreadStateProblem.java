package ocpjp7.Chapter13_Threads.Listing1319;


/*ocpjp7*/



class ThreadStateProblem {
    public static void main(String[] s) {
        Thread thread = new Thread();
        thread.start();
        thread.start();
    }
}

