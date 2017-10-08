package core._6OOP;

/**
 * Created by RomanR on 21-Oct-14.
 */
public class App06 {
    App06(){
        System.out.println("!!!");
//        new App06();
    }
}

class Main extends App06{
    Main(){}
    public static void main(String[] args) {
        new Main();
        System.out.println(new String[] {"1", "2"} [1]);
    }
}
