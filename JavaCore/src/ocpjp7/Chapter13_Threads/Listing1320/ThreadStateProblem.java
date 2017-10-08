package ocpjp7.Chapter13_Threads.Listing1320;


/*ocpjp7*/



class ThreadStateProblem extends Thread {
    synchronized public void run() {
        try {
            wait(500);
            for (int i = 0; i < 10000; i++) {
                System.out.println(Math.sin(Double.MAX_VALUE));
            }
        } catch (InterruptedException ie) {
            // its okay to ignore this exception since we’re not
            // interrupting exceptions in this code
            ie.printStackTrace();
        }
    }

    public static void main(String[] s) throws InterruptedException {
        ThreadStateProblem t = new ThreadStateProblem();
        t.start();
        Thread.sleep(100);
        System.out.println(t.getName() + ": I'm in state " + t.getState());
        Thread.sleep(500);
        System.out.println(t.getName() + ": I'm in state " + t.getState());
    }
} 
