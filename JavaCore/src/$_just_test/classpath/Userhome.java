package $_just_test.classpath;

/**
 * @author romanr on 10/28/2016.
 */
public class Userhome {
    public static void main(String[] args) {
        String classpath = System.getProperty("user.home");
        System.out.println(classpath);
    }
}
