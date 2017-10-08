package $_just_test.classpath;

import java.io.File;

/**
 * @author romanr on 10/28/2016.
 */
public class Classpath {
    public static void main(String[] args) {
        String classpath = System.getProperty("java.class.path");
        String[] classpathEntries = classpath.split(File.pathSeparator);
        for (String entry : classpathEntries) {
            System.out.println(entry);
        }
    }
}
