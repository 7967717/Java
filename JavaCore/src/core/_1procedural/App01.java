package core._1procedural;

import java.util.Arrays;

/**
 * Created by RomanR on 4/7/14.
 */
public class App01 {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3};
        int [][] arr2 = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.deepToString(arr2));


    }
}
