
/*ocpjp7*/



package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing514;

public class PrinterFriendlyFactory implements ShapeFactory {
	@Override
	public Shape getShape(String sourceType) {
		switch(sourceType) {
			case "Circle":
				return new PrinterFriendlyCircle(10, 10, 20);
			case "Rectangle":
				return new PrinterFriendlyRectangle(10, 20);
		}
		return null;
	}
}