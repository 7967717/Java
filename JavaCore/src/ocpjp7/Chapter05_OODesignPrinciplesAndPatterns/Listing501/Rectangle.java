
/*ocpjp7*/



package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing501;

// Rectangle is a concrete class and "is-a" Shape; it can be rotated and hence implements Rotatable  
public class Rectangle extends Shape implements Rotatable {
	private int length, height;
	public Rectangle(int l, int h) {
		length = l;
		height = h;
	}
	public double area() { return length * height; }
	@Override
	public void rotate(float degree) {
		// implement rotating functionality here
	}
} 