package core._1procedural;

import java.util.Arrays;

/**
 * Created by roman.rudenko on 03-Dec-15.
 */
public class App15Sort {
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 1, 8, 5, 2, 4, 7};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i];
                if (temp > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
