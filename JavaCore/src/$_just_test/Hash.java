package $_just_test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by RomanR on 4/10/14.
 */
public class Hash {
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest algorithm = MessageDigest.getInstance("MD5");
        algorithm.reset();
        algorithm.update(password.getBytes());
        byte messageDigest[] = algorithm.digest();

        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < messageDigest.length; i++) {
            hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
        }
        return hexString.toString().toUpperCase();
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(hashPassword("admin"));
    }
}
