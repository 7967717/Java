package java8.optional;

import java.util.Optional;

/**
 * @author romanr on 2/1/2017.
 */
public class Main {
    static Optional<String> o = Optional.empty();
    static String s = null;

    public static void main(String[] args) {
        System.out.println(o);
        System.out.println(o.toString());
        System.out.println(s);

        try {
            System.out.println(s.toString());
        } catch (Exception e) {
            System.out.println("In catch " + e.toString());
        }
    }
}
