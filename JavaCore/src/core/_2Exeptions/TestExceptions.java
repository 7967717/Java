package core._2Exeptions;

/**
 * Created by RomanR on 5/23/14.
 */
public class TestExceptions {
    public static void main(String[] args) {
        try{
            f();
        } catch (Exception e){
            System.out.println("cached");
        }
        System.out.println("out");

    }

    static void f() throws Exception {
        System.out.println("in f()");
        throw new Exception();
    }
}
