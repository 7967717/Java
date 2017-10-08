package $_just_test.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by RomanR on 12-Sep-14.
 */
public class ThreadExecutor {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            int i = 0;
            @Override
            public void run() {
                while (true){
                    System.out.println(i++);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
//        thread.start();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(thread);
//        if(thread)
//        Thread.sleep(1000);
        executor.shutdown();
    }
}
