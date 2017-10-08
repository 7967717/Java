package $_just_test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author roman.rudenko on 31-May-16.
 */
public class SearchingAndParsing {
    public static void main(String[] args) {
        String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone, Hugo-city\n" +
                "56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank post office,\n" +
                "Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";

//        search all words of length one or more
//        Pattern pattern = Pattern.compile("\\w+");
//        Matcher matcher = pattern.matcher(str);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }

//        search numbers of a specified length \\b\\d{5}\\b
//        Pattern pattern = Pattern.compile("\\b\\d{5}\\b");
//        Matcher matcher = pattern.matcher(str);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }

//        search email addresses
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.com");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
