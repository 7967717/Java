
/*ocpjp7*/


package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing505;

public class Test {
    public static void main(String[] s) {
        Circle circle = new Circle(10, 10, 20);
        System.out.println(circle);
        circle.setCanvas(new Canvas());
        circle.setShapeArchiver(new ShapeArchiver());
        circle.setRadius(50);
        System.out.println(circle);
    }
}