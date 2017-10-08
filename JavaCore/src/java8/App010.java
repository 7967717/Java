package java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author roman on 4/2/16.
 */
public class App010 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().toString());
        new Thread (() -> System.out.println(Thread.currentThread().toString())).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().toString());
            }
        }).start();

        Arrays.asList("qwea", "rty", "123a").stream()
                .filter( s -> s.contains("a"))
                .map(String::length)
                .forEach(System.out::println);

    }
}
