package core._4Collections;

import java.util.*;
/**
 * Created by RomanR on 5/30/14.
 */
public class App04 {

    public static final Integer ARRAY_LENGTH = 100_000;
    public static final Integer CALL_COUNT = 100_000;


    public static void main(String[] args) {

        ArrayList array = new ArrayList();
//        LinkedList array = new LinkedList();
//        HashSet array = new HashSet();

        Integer elem = 50_000;

        long st1 = System.currentTimeMillis();
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array.add(i);
        }
        long fn1 = System.currentTimeMillis();

        long st2 = System.currentTimeMillis();
        for (int i = 0; i < CALL_COUNT; i++) {
            array.contains(elem);
        }
        long fn2 =System.currentTimeMillis();

        System.out.println("adding " + (fn1-st1) );
        System.out.println("getting " + (fn2-st2) );


    }
}
