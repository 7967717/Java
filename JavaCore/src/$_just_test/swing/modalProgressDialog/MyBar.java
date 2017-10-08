package $_just_test.swing.modalProgressDialog;

import javax.swing.*;
import java.awt.*;

/**
 * Created by RomanR on 4/28/14.
 */
public class MyBar {
    public static void main(String[] args) throws InterruptedException {

        final JDialog dlg = new JDialog();
        JProgressBar dpb = new JProgressBar();
        dpb.setIndeterminate(true);
        dlg.add(BorderLayout.CENTER, dpb);
        dlg.add(BorderLayout.NORTH, new JLabel("Загружаются данные, подождите пожалуйста..."));
        dlg.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dlg.setSize(400, 75);

        Thread t = new Thread(new Runnable() {
            public void run() {
                dlg.setVisible(true);
            }
        });
        t.start();

        Thread.sleep((long)3500);

        dlg.dispose();

    }
}
