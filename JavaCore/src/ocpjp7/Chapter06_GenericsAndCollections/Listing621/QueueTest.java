package ocpjp7.Chapter06_GenericsAndCollections.Listing621;
/*ocpjp7*/



// This program shows the key characteristics of Queue interface

import java.util.*;

class QueueTest {
	public static void main(String []args) {
		Queue<String> loginSequence = new LinkedList<String>();
		
		loginSequence.add("Harrison"); 
		loginSequence.add("McCartney"); 
		loginSequence.add("Starr"); 
		loginSequence.add("Lennon"); 
		System.out.println("The login sequence is: " + loginSequence);
		while(!loginSequence.isEmpty())
			System.out.println("Removing " + loginSequence.remove());
	}
}
