
/*ocpjp7*/


package ocpjp7.Chapter14_Concurrency.Listing1404;

import java.util.concurrent.*;

// Creates a CyclicBarrier object by passing the number of threads and the thread to run
// when all the threads reach the barrier 
class CyclicBarrierTest {
    public static void main(String[] args) {
        // a mixed-double tennis game requires four players; so wait for four players
        // (i.e., four threads) to join to start the game
        System.out.println("Reserving tennis court \n As soon as four players arrive, game will start");
        CyclicBarrier barrier = new CyclicBarrier(4, new MixedDoubleTennisGame());
        new Player(barrier, "G I Joe");
        new Player(barrier, "Dora");
        new Player(barrier, "Tintin");
        new Player(barrier, "Barbie");
    }
}
