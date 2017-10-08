package $_just_test.test;

/**
 * @author romanr on 13-Jan-15.
 */
public class A {
    int i;
    int x;

    public A(int i, int x) {
        this.i = i;
        this.x = x;
    }


}

class B {
    public static void main(String[] args) {
        new A(1, 1);
    }
}
