package core._5Thread;

/**
 * Created by RomanR on 02-Jun-14.
 */
public class App01 {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        synchronized (obj) {
            obj.notify();
        }
        int a = -7;
    }
}
