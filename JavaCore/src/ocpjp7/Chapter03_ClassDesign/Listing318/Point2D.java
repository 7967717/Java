package ocpjp7.Chapter03_ClassDesign.Listing318;


/*ocpjp7*/


class Point2D {
    private int xPos, yPos;

    public Point2D(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public static void main(String[] args) {
        System.out.println(new Point2D(10, 20));
    }

    public String toString() {
        return "x = " + xPos + ", y = " + yPos;
    }
}
