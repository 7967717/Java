
/*ocpjp7*/



package ocpjp7.Chapter13_Threads.Listing1309;

// This class implements Runnable interface
// Its run method increments the counter three times 
class UseCounter implements Runnable {
    public void increment() {
        // increments the counter and prints the value
        // of the counter shared between threads
        Counter.count++;
        System.out.print(Counter.count + "  ");
    }

    public void run() {
        increment();
        increment();
        increment();
    }
}