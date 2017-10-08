package core._1procedural;

/**
 * Created by RomanR on 5/20/14.
 */
public class App08 {
    public static void main(String[] args) {

        f(1);
    }

    static void f(int x){
        x++;
        f(x);
    }
}
