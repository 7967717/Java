
/*ocpjp7*/



package ocpjp7.Chapter03_ClassDesign.Listing304;

class Canvas {
	void getArea() {
		Circle  circle = new Circle();
		circle.area(); 	// call to public method area(), outside package
	}
}
