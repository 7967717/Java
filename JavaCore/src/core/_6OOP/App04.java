package core._6OOP;

/**
 * Created by RomanR on 05-Jun-14.
 */
public class App04 {
    public static void main(String[] args) {
        Runnable r = new A().f();
        r.run();
    }
}

class A {
    public Runnable f(){
        final Integer[] i = new Integer[1];
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(i);
            }
        };
    }
}
