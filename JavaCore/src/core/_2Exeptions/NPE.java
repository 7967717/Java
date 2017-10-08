package core._2Exeptions;

/**
 * Created by RomanR on 5/23/14.
 */
public class NPE {
    public static void main(String[] args) {
        Integer i = null;
        try{
            f(i);
        } catch (NullPointerException e) {
            System.out.println("you have NPE");
        }
        System.out.println("go on");
    }

    static Integer f(Integer i){
        return i++;
    }
}
