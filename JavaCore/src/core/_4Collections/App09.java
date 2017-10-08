package core._4Collections;

import java.util.*;

/**
 * @author roman.rudenko on 25-Apr-16.
 */
public class App09 {
    public static void main(String[] args) {
        List<?> list = Arrays.asList(1, 2, 3);

        new ArrayList<Integer>();
//        list.add(new Integer(10));
//        list = Arrays.asList("one", "two", "three");

        for (Object i : list) {
            System.out.println(i);
        }

        Iterator<?> iter0 = list.iterator();
        while (iter0.hasNext()){
            System.out.println(iter0.next());
        }

        for(Iterator<?> iter1 = list.iterator(); iter1.hasNext();) {
            System.out.println(iter1.next());
        }
    }
}
