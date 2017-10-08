package core._1procedural;

/**
 * Created by RomanR on 5/14/14.
 */
public class App07 {
    public static void main(String[] args) {
        f(1);
    }

    private static void f(int i) {
        System.out.println(i);
        if(i < 7) {
            f(2 * i);
        }
        System.out.println(i);
    }
}
