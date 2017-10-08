package core._1procedural.string;

/**
 * Created by RomanR on 05-Sep-14.
 */
public class Substring {
    public static void main(String[] args) {
        String s = "http://10.16.3.185:2291/GET_SUBS_INFO?CHANNEL=WWW&amp;INFO=8&amp;SUBS=";
        System.out.println(s.substring(s.indexOf("/") + 2, s.lastIndexOf("/")));
    }
}
