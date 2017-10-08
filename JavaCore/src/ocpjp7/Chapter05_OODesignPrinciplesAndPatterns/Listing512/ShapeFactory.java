
/*ocpjp7*/



package ocpjp7.Chapter05_OODesignPrinciplesAndPatterns.Listing512;

public class ShapeFactory {
	 public static Shape getShape(String sourceType) {
		switch(sourceType) {
		case "Circle":
			return new Circle(10, 10, 20);
		case "Rectangle":
			return new Rectangle(10, 20);
		}
		return null;
	}
}