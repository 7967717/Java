/*ocpjp7*/


package ocpjp7.Chapter06_GenericsAndCollections.Listing619;

import java.util.HashSet;
import java.util.Set;

class TestCircle {
    public static void main(String[] args) {
        Set<Circle> circleList = new HashSet<Circle>();
        circleList.add(new Circle(10, 20, 5));
        System.out.println(circleList.contains(new Circle(10, 20, 5)));
    }
}