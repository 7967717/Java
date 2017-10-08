package ocpjp7.Chapter14_Concurrency.Listing1404;
/*ocpjp7*/


import java.util.concurrent.*;

// The run() method in this thread should be called only when four players are ready to start the game 
class MixedDoubleTennisGame extends Thread {
    public void run() {
        System.out.println("All four players ready, game starts \n Love all...");
    }
}
