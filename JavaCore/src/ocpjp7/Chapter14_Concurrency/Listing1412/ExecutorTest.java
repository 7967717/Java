
/*ocpjp7*/


package ocpjp7.Chapter14_Concurrency.Listing1412;

// This class spawns a Task thread and explicitly calls start() method.
// It also shows how to execute a Thread using Executor 
class ExecutorTest {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Task();
        System.out.println("Calling Task.run() by directly creating a Thread object");
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(10);
        RepeatedExecutor executor = new RepeatedExecutor();
        executor.execute(runnable, 3);
    }
}
