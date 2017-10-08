package ocpjp7.Chapter14_Concurrency.Listing1413;
/*ocpjp7*/


import java.util.concurrent.*;

// Illustrates how Callable, Executors, ExecutorService, and Future are related;
// also shows how they work together to execute a task 
class CallableTest {
    public static void main(String[] args) throws Exception {
        // the value for which we want to find the factorial
        long N = 20;
        // get a callable task to be submitted to the executor service
        Callable<Long> task = new Factorial(N);
        // create an ExecutorService with a fixed thread pool consisting of one thread
        ExecutorService es = Executors.newSingleThreadExecutor();
        // submit the task to the executor service and store the Future object
        Future<Long> future = es.submit(task);
        // wait for the get() method that blocks till the computation is complete.
        System.out.printf("factorial of %d is %d", N, future.get());
        // done. shutdown the executor service since we don't need it anymore
        es.shutdown();
    }
}
