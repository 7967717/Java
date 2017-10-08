/*ocpjp7*/


package ocpjp7.Chapter06_GenericsAndCollections.Listing611;

import java.util.ArrayList;
import java.util.List;

class UtilitiesTest {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);
        System.out.println("The original list is: " + intList);
        Utilities.fill(intList, 100);
        System.out.println("The list after calling Utilities.fill() is: " + intList);
    }
}
