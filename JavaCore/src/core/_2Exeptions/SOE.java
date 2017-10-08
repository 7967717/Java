package core._2Exeptions;

/**
 * Created by RomanR on 28-Oct-14.
 */
public class SOE {
    public static void main(String[] args) /*throws MyException*/{

//        System.out.println(7/0);

        try {
            new SOE().go();
        } catch (Error e){
            e.printStackTrace();
            System.out.println("oops");
        }
    }

    private void go() {
        go();
    }
}
class MyException extends Exception { }