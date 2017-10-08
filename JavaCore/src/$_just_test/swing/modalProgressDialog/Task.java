package $_just_test.swing.modalProgressDialog;

import javax.swing.*;
import java.awt.*;

/**
 * Created by RomanR on 4/28/14.
 */
public class Task implements Runnable {
    private volatile boolean isRunning = true;


    @Override
    public void run() {

            System.out.println("creates JDialog in Task");
            final JDialog dlg = new JDialog();
            JProgressBar dpb = new JProgressBar();
            dpb.setIndeterminate(true);
            dlg.add(BorderLayout.CENTER, dpb);
            dlg.add(BorderLayout.NORTH, new JLabel("Загружаются данные, подождите пожалуйста..."));
            dlg.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            dlg.setSize(400, 75);

            System.out.println("creates Thread in Task");
            Thread t = new Thread(new Runnable() {
                public void run() {
                    System.out.println("starts Run in Task");
                    dlg.setVisible(true);
                }
            });
            t.start();

        while (isRunning) {
            try {
                System.out.println("Sleeping...");
                Thread.sleep((long) 1500);

                System.out.println("Processing");
            } catch (InterruptedException e) {
                System.out.println("Exception");
                isRunning = false;
            }
        }

    }

    public void stop() {
        isRunning = false;
        System.out.println("stops Run in Task");
    }

}

