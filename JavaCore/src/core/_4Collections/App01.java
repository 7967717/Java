package core._4Collections;

import java.util.ArrayList;

/**
 * Created by RomanR on 5/28/14.
 */
public class App01 {
    public static void main(String[] args) {
        ArrayList<? super Object> ref = new ArrayList<>();

        Integer i = 1;
        Number n = 1;
        Object o = new Object();
        ref.add(i);
        ref.add(n);
        ref.add(o);
//        ref.add(n1);
        System.out.println(ref);
    }
}
