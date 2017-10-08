package ocpjp7.Chapter03_ClassDesign.Listing315;


/*ocpjp7*/



// improved version of the Point class with overridden toString method 
class Point {
	private int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	// this toString method overrides the default toString method implementation 
	// provided in the Object base class 
	public String toString() {
		return "x = " + xPos + ", y = " + yPos; 
	} 

	public static void main(String []args) {
		System.out.println(new Point(10, 20)); 
	}	
}
