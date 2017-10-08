package core._4Collections;

import java.util.Arrays;

/**
 * Created by RomanR on 08-Sep-14.
 */
public class App07 {
    public static void main(String[] args) {
        int [] ar1 = {2, 4, 6, 8};
        int [] ar2 = {1, 3, 5, 7, 9};
        int [] temp;
        int [] dest = new int[ar1.length + ar2.length];

        if (ar1.length >= ar2.length){
            temp = ar1;
        } else {
            temp = ar2;
        }

        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < (ar1.length + ar2.length) - 1; i++) {
//            if (index1 >= ar1.length - 1) {
//                dest[i] = ar2[index2];
//                index2++;
//                break;
//            } else if (index2 >= ar2.length - 1) {
//                dest[i] = ar1[index1];
//                index1++;
//                break;
//            }
                if (ar1[index1] <= ar2[index2]) {
                    dest[i] = ar1[index1];
                    index1++;
                } else {
                    dest[i] = ar2[index2];
                    index2++;
                }

        }

        for (int i : dest){
            System.out.println(i);
        }
//            System.out.println(Arrays.asList(dest));

    }
}
