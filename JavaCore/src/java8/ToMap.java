package java8;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author roman.rudenko on 05-Sep-16.
 */
public class ToMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        System.out.println(map);
        map = Stream.of(
                new AbstractMap.SimpleEntry<>("name", ""),
                new AbstractMap.SimpleEntry<>("email", ""),
                new AbstractMap.SimpleEntry<>("body", ""))
                .collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));
        System.out.println(map);
    }
}
