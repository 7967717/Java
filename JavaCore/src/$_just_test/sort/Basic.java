package $_just_test.sort;

import java.util.Arrays;

/**
 * Created by roman.rudenko on 20-Oct-15.
 */
public class Basic {

    public static void main(String[] args) {
        int[] array = new int[]{9, 1, 5, 3, 2, 6, 8, 1};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sort1(array)));
        System.out.println(Arrays.toString(sort2(array)));
    }

    private static int[] sort1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i];
                if (temp > array[j]) {
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    private static int[] sort2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }
}
