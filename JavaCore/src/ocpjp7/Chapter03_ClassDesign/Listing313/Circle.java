
/*ocpjp7*/



package ocpjp7.Chapter03_ClassDesign.Listing313;

class Circle extends Shape {
	private int radius; 
	public Circle(int r) { radius = r; } 
	// other constructors 
	public double area() {return Math.PI * radius * radius; } 
	// other declarations
}
