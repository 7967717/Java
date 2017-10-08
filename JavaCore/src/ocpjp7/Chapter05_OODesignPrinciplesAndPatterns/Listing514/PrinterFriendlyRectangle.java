package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing514;

/*ocpjp7*/




public class PrinterFriendlyRectangle implements PrinterFriendlyShape {
	public PrinterFriendlyRectangle(int length, int height) {
		this.length = length;
		this.height = height;
		System.out.println("PrinterFriendlyRectangle constructor");
	}
	private int length, height;
	@Override
	public void draw() {
		System.out.println("PrinterFriendlyRectangle draw()");
		// draw() implementation
	}
}