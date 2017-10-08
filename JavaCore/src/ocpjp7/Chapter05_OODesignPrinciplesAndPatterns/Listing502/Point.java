/*ocpjp7*/


package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing502;

// Point is an independent class and here we are using it with Circle class 
class Point {
    private int xPos;
    private int yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public String toString() {
        return "(" + xPos + "," + yPos + ")";
    }
}

