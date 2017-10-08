package core._1procedural.string;

/**
 * Created by RomanR on 27-Oct-14.
 */
public class Concat {
    public static void main(String[] args) {
        String a = "admin_Maintenance123!@#$%^&*()";
        int b = 1;
        int c = 2;
        System.out.println(a + b + c);
        System.out.println(b + c + a);
        System.out.println(42l == 42.0f);

        System.out.println("1" + "\\\\s+" + "2");
        System.out.println("1" + " " + "2");
        System.out.println("1" + "" + "2");

        System.out.println(a.replaceAll("(?s).", "*"));
    }
}
