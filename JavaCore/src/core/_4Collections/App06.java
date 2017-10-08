package core._4Collections;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by RomanR on 18-Jul-14.
 */
public class App06 {
    public static void main(String[] args) {
        String[] array = {"name1","name1","name2","name2", "name2","name3","name3","name3","name4", "name5"};
        List<String> list = Arrays.asList(array);

        Map<String,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String word=list.get(i);
            if (!map.containsKey(word)){
                map.put(word,1);
            } else {
                map.put(word, map.get(word) +1);
            }
        }

        System.out.println(map);

    }
}
