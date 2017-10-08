package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing502;


/*ocpjp7*/


public class Circle {
    private Point center;    // Circle "contains" a Point object
    private int radius;

    public Circle(int x, int y, int r) {
        center = new Point(x, y);
        radius = r;
    }

    public static void main(String[] s) {
        System.out.println(new Circle(10, 10, 20));
    }

    public String toString() {
        return "center = " + center + " and radius = " + radius;
    }
    // other members (constructors, area method, etc) are elided ...
}