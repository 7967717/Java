package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing505;


/*ocpjp7*/


// Circle class "informs" (i.e., "notifies") Canvas and ShapeArchiver whenever it gets "changed"
// by calling the update method of these two classes  
public class Circle {
    protected Canvas canvas;
    private Point center;
    private ShapeArchiver shapeArchiver;
    private int radius;

    public Circle(int x, int y, int r) {
        center = new Point(x, y);
        radius = r;
    }

    public void setCenter(Point center) {
        this.center = center;
        canvas.update(this);
        shapeArchiver.update(this);
    }

    public void setRadius(int radius) {
        this.radius = radius;
        canvas.update(this);
        shapeArchiver.update(this);
    }

    public void setShapeArchiver(ShapeArchiver shapeArchiver) {
        this.shapeArchiver = shapeArchiver;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public String toString() {
        return "center = " + center + " and radius = " + radius;
    }
}