package ocpjp7.Chapter06_GenericsAndCollections.Listing603;


/*ocpjp7*/



// The program demonstrates "Object" based implementation and associated lack of type-safety 
class BoxPrinter {
	private Object val; 
	public BoxPrinter(Object arg) {
		val = arg; 
	}  	
	public String toString() {
		return "[" + val + "]"; 
	} 
	public Object getValue() {
		return val; 	
	}
} 
 