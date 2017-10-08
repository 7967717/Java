package ocpjp7.Chapter07_StringProcessing.Listing705;


/*ocpjp7*/



// this example demonstrates the usage of split() method
public class ParseString1 {
	public static void main(String[] s) {
		String quote = "Never lend books-nobody ever returns them!";
		String [] words = quote.split(" "); // split strings based on the delimiter " " (space)
		for (String word : words) {
			System.out.println(word);
		}
	}
}
