package ocpjp7.Chapter14_Concurrency.Listing1412;
/*ocpjp7*/


import java.util.concurrent.*;

// This Task class implements Runnable, so its a Thread object 
class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Calling Task.run() ");
    }
}
