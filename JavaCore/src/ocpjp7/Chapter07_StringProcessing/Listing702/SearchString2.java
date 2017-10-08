package ocpjp7.Chapter07_StringProcessing.Listing702;


/*ocpjp7*/



// Demonstrates searching a substring within a string using indexOf() method
public class SearchString2 {
	public static void main(String[] s){
		String str = "I am preparing for OCPJP";
		System.out.println("Substring \"for\" occurs at index: " + str.indexOf("for"));
	}
}