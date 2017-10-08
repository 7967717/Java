package core._1procedural;

import java.util.Arrays;

/**
 * Created by RomanR on 4/9/14.
 */
public class App06 {
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 7, 5, 3, 9, 1};
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1; j++) {
                swap(arr1, j, j + 1);
            }
        }

        System.out.println(Arrays.toString(arr1));


    }

    public static int[] swap(int[] arr, int prev, int next) {
        if (arr[prev] > arr[next]) {
            int tmp = arr[prev];
            arr[prev] = arr[next];
            arr[next] = tmp;
        }
        return arr;
    }

}
