package ocpjp7.Chapter06_GenericsAndCollections.Listing628;
/*ocpjp7*/


// It demonstrates sorting on Arrays

import java.util.Arrays;

class CollectionsTest {
    public static void main(String[] args) {
        String[] strArr = {"21", "1", "111", "12", "123"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        int[] intArr = {21, 1, 111, 12, 123};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
    }
}
 
