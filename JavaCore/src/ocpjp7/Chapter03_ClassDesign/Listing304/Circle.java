
/*ocpjp7*/



package ocpjp7.Chapter03_ClassDesign.Listing304;

public class Circle extends Shape {
	private int radius;	// private field
	public void area() {	// public method
		// access to private field radius inside the class
		System.out.println("area:"+3.14*radius*radius); 
	}
	void fillColor() {
		System.out.println("color:" + color); //access to protected field, in subclass
	}
}
