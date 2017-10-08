package core._3IO;

import java.io.UnsupportedEncodingException;

/**
 * Created by RomanR on 5/26/14.
 */
public class Chars {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = new byte[]{76, 77, 78};
        System.out.println(new String(bytes, "UTF-8"));
        System.out.println(bytes[0]);
        System.out.println(bytes[1]);
        System.out.println(bytes[2]);
        char[] chars = (new String(bytes, "UTF-8")).toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);
    }
}
