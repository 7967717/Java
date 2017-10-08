package ocpjp7.Chapter07_StringProcessing.Listing714;


/*ocpjp7*/



// This program shows the usage of formatting string in printf() method
class Circle {
	private int x, y, radius;
	public Circle(int x, int y, int radius) {
		this.x =x;
		this.y = y;
		this.radius = radius;
	}
	void area() {
		double tempArea = Math.PI * radius * radius;  
		System.out.println("Cirle area using default formatting with println: " + tempArea);
		System.out.printf("Circle area using format specifier with printf: %.2f",  tempArea);
	}
	public static void main(String[] str) {
		Circle circle = new Circle(10,10,5);
		circle.area();
	}
}