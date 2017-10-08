
/*ocpjp7*/



package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing514;

public class Test {
	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		canvas.addNewShape("Circle", "DisplayFriendly");
		canvas.addNewShape("Rectangle", "DisplayFriendly");
		canvas.redraw();
	}
}