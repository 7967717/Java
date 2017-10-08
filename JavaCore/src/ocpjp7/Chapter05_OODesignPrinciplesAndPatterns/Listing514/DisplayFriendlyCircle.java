
/*ocpjp7*/



package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing514;

public class DisplayFriendlyCircle implements DisplayFriendlyShape {
private int xPos, yPos;
	private int radius;
	public DisplayFriendlyCircle(int x, int y, int r) {
		xPos = x;
		yPos = y;
        		radius = r;
	        	System.out.println("DisplayFriendlyCircle constructor");
        	}
	@Override
	public void draw() {
		System.out.println("DisplayFriendlyCircle draw()");
		// draw() implementation
	}
}
