/*ocpjp7*/


package ocpjp7.Chapter06_GenericsAndCollections.Listing610;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// This program demonstrates usage of raw types along with generics
class RawTest {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("First");
        list.add("Second");
        List<String> strList = list;
//    	strList.add(10);	//#1: generates compiler error
        for (Iterator<String> itemItr = strList.iterator(); itemItr.hasNext(); )
            System.out.println("Item : " + itemItr.next());

        List<String> strList2 = new LinkedList<>();
        strList2.add("First");
        strList2.add("Second");
        List list2 = strList2;
        list2.add(10);    //#2: compiles fine, results in runtime exception
        for (Iterator<String> itemItr = list2.iterator(); itemItr.hasNext(); )
            System.out.println("Item : " + itemItr.next());
    }
}
