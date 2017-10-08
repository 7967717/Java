package core._1procedural.string;

/**
 * @author Roman Rudenko on 28-Apr-15.
 */
public class PutCharInString {
    public static void main(String[] args) {
        String otp = "112233";
        System.out.println(new StringBuilder(otp).insert(otp.length()-4, "-").insert(otp.length()-1, "-"));
    }
}
