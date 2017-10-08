package ocpjp7.Chapter06_GenericsAndCollections.Listing611;
/*ocpjp7*/


// This program demonstrates generic methods

import java.util.List;

class Utilities {
    public static <T> void fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++)
            list.set(i, val);
    }
}