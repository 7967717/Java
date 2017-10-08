package $_just_test.test;

/**
 * @author Roman Rudenko on 07-Apr-15.
 */
public class App01 {
    public static void main(String[] args) {
        m(1);

    }
    static void m(int i) {
        System.out.println("int");
    }
    static void m(Integer i) {
        System.out.println("Integer");
    }
}
