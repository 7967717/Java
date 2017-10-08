package $_just_test.swing.modalProgressDialog;

/**
 * Created by RomanR on 4/28/14.
 */
public class Dialog {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("thread started");
//        for (int i = 0; i < 500; i++) {
//            System.out.println("print" + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//        }
        if(thread != null) {
            task.stop();
            thread.join();
        }
    }
}
