
/*ocpjp7*/



package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing505;

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