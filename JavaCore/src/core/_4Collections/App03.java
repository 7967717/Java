package core._4Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by RomanR on 5/29/14.
 */
public class App03 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "*");
        map.put("B", "+");
        map.put("C", "-");

        for(Map.Entry<String, String> elem : map.entrySet()){
            System.out.println(elem);
        }

        for (int elem : new int[] {1, 2, 3, 4} ) {
            System.out.println(elem);
        }
    }
}
