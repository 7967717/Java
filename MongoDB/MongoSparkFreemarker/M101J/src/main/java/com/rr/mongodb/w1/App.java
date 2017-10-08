package com.rr.mongodb.w1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Integer [] arr = {4, 6, 2};
        System.out.println(Arrays.asList(arr));
        System.out.println(Collections.max(Arrays.asList(arr)));
        List<Integer> list = Arrays.asList(arr);
        Collections.sort(list);
        System.out.println(list);

    }

}
