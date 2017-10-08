
/*ocpjp7*/



package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing512;

public class Rectangle implements Shape {
	public Rectangle(int length, int height) {
		this.length = length;
		this.height = height;
		System.out.println("Rectangle constructor");
	}
	private int length, height;
	@Override
	public void draw() {
		System.out.println("Rectangle draw()");
		// draw() implementation
	}
	@Override
	public void fillColor() {
		// fillColor() implementation
	}
}
