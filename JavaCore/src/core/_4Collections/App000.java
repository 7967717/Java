package core._4Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App000 implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

class Main01 {

    public static void main(String[] args) {
        Integer [] arr = {0, 1, 2, 3, 4};
        System.out.println(Arrays.asList(arr));

        System.out.println("_____________________________");

        Iterator iter = Arrays.asList(arr).iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }

}
