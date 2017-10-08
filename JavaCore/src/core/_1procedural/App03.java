package core._1procedural;

import java.util.Arrays;

/**
 * Created by RomanR on 4/7/14.
 */
public class App03 {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5, 6};
//        int [] arr1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr1.length / 2; i++) {
            int tmp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = tmp;
        }

        System.out.println(Arrays.toString(arr1));

        invertRec(arr1, 0);

        System.out.println(Arrays.toString(arr1));
    }

    public static void invertRec (int[] data, int k){
        if(k < data.length / 2){
            int tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
            invertRec(data, k + 1);

        }
    }
}
