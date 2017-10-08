package core._4Collections;

import java.util.*;

/**
 * Created by RomanR on 5/29/14.
 */
public class App00 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        List<String> stringList = new LinkedList<>();
//        Set<String> stringSet = new HashSet<>();
        Set<String> stringSet = new TreeSet<>();
        Map<Integer, String> stringMap = new HashMap<>();

        stringList.add("b");
        stringList.add("a");
        stringList.add("c");
        System.out.println(stringList.size());
        System.out.println(stringList.isEmpty());
        System.out.println(stringList);
        stringSet.add("d");
        stringSet.add("e");
        stringSet.add("f");
        System.out.println(stringSet.size());
        System.out.println(stringSet.isEmpty());
        System.out.println(stringSet);
        stringMap.put(0, "g");
        stringMap.put(1, "h");
        stringMap.put(2, "i");
        System.out.println(stringMap.size());
        System.out.println(stringMap.isEmpty());
        System.out.println(stringMap);
        System.out.println(stringMap.keySet());
        System.out.println(stringMap.values());
        System.out.println(stringMap.entrySet());

    }
}
