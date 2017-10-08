package ocpjp7.Chapter13_Threads.Listing1317;


/*ocpjp7*/



// This class has run method which waits for ever since there is no other thread to notify it 
class InfiniteWaitThread extends Thread {
    static boolean okayToRun = false;

    synchronized public void run() {
        while (!okayToRun) {
            try {
                // note the call to wait without any timeout value
                // so it waits forever for some thread to notify it
//                wait(500);
                wait();
            } catch (InterruptedException ie) {
                // its okay to ignore this exception since we’re not
                // interrupting exceptions in this code
                ie.printStackTrace();
            }
        }
    }
}
