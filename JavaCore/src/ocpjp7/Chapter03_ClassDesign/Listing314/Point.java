package ocpjp7.Chapter03_ClassDesign.Listing314;


/*ocpjp7*/



class Point {
	private int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public static void main(String []args) {
		// Passing a Point object to println automatically invokes the toString method 
		System.out.println(new Point(10, 20)); 
	}	
}
