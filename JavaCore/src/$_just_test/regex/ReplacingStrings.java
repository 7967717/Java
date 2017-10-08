package $_just_test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author roman.rudenko on 31-May-16.
 */
public class ReplacingStrings {
    public static void main(String[] args) {
        String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone, Hugo-city\n" +
                "56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank post office,\n" +
                "Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";

//        change phone number format to XXX-XXXXXXX format
//        Pattern pattern = Pattern.compile("(\\D)(\\d{3})(\\d{7})(\\D)");
//        Matcher matcher = pattern.matcher(str);
//        String newStr = matcher.replaceAll("$1$2-$3$4");
//        System.out.println(newStr);

//        how validate an IP address
        String ipStr1 = "255.245.188.123"; // valid IP address
        String ipStr2 = "255.245.188.273"; // invalid IP address - 273 is greater than 255
        ReplacingStrings validator = new ReplacingStrings();
        validator.validateIP(ipStr1);
        validator.validateIP(ipStr2);
    }

    void validateIP(String ipStr) {
        String regex = "\\b((25[0–5]|2[0–4]\\d|[01]?\\d\\d?)(\\.)){3}(25[0–5]|2[0–4]\\d|[01]?\\d\\d?)\\b";
        System.out.println(ipStr + " is valid? => " + Pattern.matches(regex, ipStr));
    }

}
