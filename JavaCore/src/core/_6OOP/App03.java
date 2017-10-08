package core._6OOP;

/**
 * Created by RomanR on 05-Jun-14.
 */
public class App03 {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("!!!!!!!");
                }
            }
        }).start();

        while (true) {
            System.out.println("@@@@@@@@@");
        }
    }
}
