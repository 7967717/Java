package $_just_test.swing.samples;

import javax.swing.*;
import java.awt.*;


/**
 * Created by RomanR on 5/19/14.
 */
public class MessageDialog extends javax.swing.JDialog {

    public MessageDialog(Frame parent, String title, String message) {

        super(parent);


        final JOptionPane optionPane = new JOptionPane(message, JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(title);
        setLocationByPlatform(true);
        setModal(true);
        setContentPane(optionPane);
        pack();
        setVisible(true);
    }

}
