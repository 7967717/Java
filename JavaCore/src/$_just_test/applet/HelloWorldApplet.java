package $_just_test.applet;

import java.applet.*;
import java.awt.*;

/**
 * Created by roman.rudenko on 01-Dec-15.
 */
public class HelloWorldApplet extends Applet {
    public void paint (Graphics g)
    {
        g.drawString ("Hello World", 25, 50);
    }
}
