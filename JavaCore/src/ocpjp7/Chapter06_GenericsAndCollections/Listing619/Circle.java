package ocpjp7.Chapter06_GenericsAndCollections.Listing619;
/*ocpjp7*/


// This program shows the importance of equals() and hashCode() methods

class Circle {
    private int xPos, yPos, radius;

    public Circle(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
    }

    public boolean equals(Object arg) {
        if (arg == null) return false;
        if (this == arg) return true;
        if (arg instanceof Circle) {
            Circle that = (Circle) arg;
            if ((this.xPos == that.xPos) && (this.yPos == that.yPos)
                    && (this.radius == that.radius)) {
                return true;
            }
        }
        return false;
    }
}
