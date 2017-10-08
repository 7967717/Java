package $_just_test.thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author romanr on 19-Jan-15.
 */
public class ThreadLocalDemo {
    private DateFormat df = new SimpleDateFormat("MM/dd/yy");

    public String formatCurrentDate() {
        return df.format(new Date());
    }

    public String formatFirstOfJanyary1970() {
        return df.format(new Date(0));
    }
}

class Main0 {
    public static void main(String[] args) {
        ThreadLocalDemo threadLocalDemo = new ThreadLocalDemo();
        System.out.println(threadLocalDemo.formatCurrentDate());
        System.out.println(threadLocalDemo.formatFirstOfJanyary1970());
    }
}
