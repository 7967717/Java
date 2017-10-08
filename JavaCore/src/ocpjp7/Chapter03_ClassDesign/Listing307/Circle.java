package ocpjp7.Chapter03_ClassDesign.Listing307;


/*ocpjp7*/



// a Circle object can be created by dragging and dropping a circle template
// the x, and y positions need to be set in that case, but a default radius value can be assumed 
class Circle{
	private int xPos, yPos, radius;
	public Circle(int x, int y) {
		xPos = x;
		yPos = y;	 
		radius = 10; // default radius 
	}
}