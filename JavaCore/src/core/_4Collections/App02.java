package core._4Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by RomanR on 5/29/14.
 */
public class App02 {
    public static void main(String... args) {
        List<String> arrayList = new ArrayList<>(asList("A", "BB", "CCC"));
        List<String> linkedList = new LinkedList<>(asList("D", "EE", "FFF"));
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(linkedList);

        long st1 = System.currentTimeMillis();
        System.out.println(st1);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        long fin1 = System.currentTimeMillis();
        System.out.println(fin1);
        System.out.println(fin1 - st1);

        Iterator<String> iter = linkedList.iterator();
        long st2 = System.currentTimeMillis();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        long fin2 = System.currentTimeMillis();
        System.out.println(fin2 - st2);

        for (Iterator<String> iter1 = linkedList.iterator(); iter1.hasNext(); ) {
            System.out.println(iter1.next());
        }

    }
}
