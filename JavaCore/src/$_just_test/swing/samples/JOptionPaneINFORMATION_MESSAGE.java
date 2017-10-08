package $_just_test.swing.samples;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 * Created by RomanR on 5/19/14.
 */
public class JOptionPaneINFORMATION_MESSAGE {

    public static void main(String[] args) {
        final JPanel panel = new JPanel();

//        JOptionPane.showMessageDialog(panel, "Download completed", "Question",
//                JOptionPane.INFORMATION_MESSAGE);

//        JOptionPane.showMessageDialog(null, "My Goodness, this is so concise");

        JOptionPane.showOptionDialog(null, "Hello","Empty?", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);
    }

}
