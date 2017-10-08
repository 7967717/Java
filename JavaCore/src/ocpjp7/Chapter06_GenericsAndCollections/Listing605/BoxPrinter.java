package ocpjp7.Chapter06_GenericsAndCollections.Listing605;


/*ocpjp7*/



// This program demonstrates the type-safety feature of generics
class BoxPrinter<T> {
	private T val; 
	public BoxPrinter(T arg) {
		val = arg; 
	}  
	public String toString() {
		return "[" + val + "]"; 
	}
	public T getValue() {
		return val; 
	} 
} 