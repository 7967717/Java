package ocpjp7.Chapter06_GenericsAndCollections.Listing604;


/*ocpjp7*/



// This program shows container implementation using generics
class BoxPrinter<T> {
	private T val; 
	public BoxPrinter(T arg) {
		val = arg; 
	}  
	public String toString() {
		return "[" + val + "]"; 
	} 
} 
 