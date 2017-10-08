package $_just_test.swing.samples;

import javax.swing.*;

/**
 * Created by RomanR on 5/19/14.
 */
public class Main {
    public static void main(String[] args) {
        final JFrame panel = new JFrame();
        new MessageFrame(panel, "Закрытие", "Программа закрывается");
    }
}
