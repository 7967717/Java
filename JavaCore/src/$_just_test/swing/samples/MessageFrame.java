package $_just_test.swing.samples;

import javax.swing.*;

/**
 * Created by RomanR on 5/19/14.
 */
public class MessageFrame extends JFrame {

    public MessageFrame(JFrame parent, String title, String message){

        final JOptionPane optionPane = new JOptionPane(message, JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(title);
        setLocationByPlatform(true);
        setContentPane(optionPane);
        setUndecorated(true);
        pack();
        setVisible(true);
    }
}
