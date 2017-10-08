
/*ocpjp7*/



package ocpjp7.Chapter03_ClassDesign.Listing313;

class Square extends Shape {
	private int side; 
	public Square(int a) { side = a; } 
	public double area() { return side * side; } 
	// other declarations
}