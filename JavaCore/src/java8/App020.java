package java8;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author roman on 4/10/16.
 */
public class App020 {
    public static void main(String[] args) {
        Arrays.asList("Azc", "Bjgh", "Cetry").stream()
                .filter(s -> s.length() > 3)
                .forEach(System.out::println);

        Stream.of("Azc", "Bjgh", "Cetry")
                .filter(s -> s.length() > 3)
                .forEach(System.out::println);
    }
}
