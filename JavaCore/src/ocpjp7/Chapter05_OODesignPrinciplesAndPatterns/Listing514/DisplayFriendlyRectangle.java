package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing514;
/*ocpjp7*/




public class DisplayFriendlyRectangle implements DisplayFriendlyShape {
	public DisplayFriendlyRectangle(int length, int height) {
		this.length = length;
		this.height = height;
		System.out.println("DisplayFriendlyRectangle constructor");
	}
	private int length, height;
	@Override
	public void draw() {
		System.out.println("DisplayFriendlyRectangle draw()");
		// draw() implementation
	}
}