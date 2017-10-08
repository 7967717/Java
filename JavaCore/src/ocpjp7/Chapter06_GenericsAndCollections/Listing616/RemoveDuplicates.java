package ocpjp7.Chapter06_GenericsAndCollections.Listing616;
/*ocpjp7*/


// This program demonstrates the usage of HashSet class

import java.util.HashSet;
import java.util.Set;

class RemoveDuplicates {
    public static void main(String[] args) {
        String tongueTwister = "I feel, a feel, a funny feel, a funny feel I feel, if you feel the feel  I feel, I feel the feel you feel";
        Set<String> words = new HashSet<>();

        // split the sentence into words and try putting them in the set
        for (String word : tongueTwister.split("\\W+"))
            words.add(word);

        System.out.println("The tongue twister is: " + tongueTwister);
        System.out.print("The words used were: ");
        System.out.println(words);
    }
}