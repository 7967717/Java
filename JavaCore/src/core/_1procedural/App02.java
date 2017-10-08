package core._1procedural;

/**
 * Created by RomanR on 4/7/14.
 */
public class App02 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("a= " + a);
        System.out.println("b= " + b);

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("a= " + a);
        System.out.println("b= " + b);

    }
}
