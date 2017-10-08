package ocpjp7.Chapter04_AdvancedClassDesign.Listing404;


/*ocpjp7*/



public class Counter {
	private static int count; 
	static {
		// code in this static block will be executed when JVM loads the class into memory 
		count = 1; 
	}
	public Counter() { 
		count++;
	}
	public static void printCount() { 
		System.out.println("Number of instances created so far is: " + count);
	}
	public static void main(String []args) {
		Counter anInstance = new Counter();
		Counter.printCount(); 
		Counter anotherInstance = new Counter();
		Counter.printCount();
	}
}
