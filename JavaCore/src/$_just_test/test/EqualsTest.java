package $_just_test.test;

/**
 * Created by RomanR on 13-Aug-14.
 */
public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        A0 a1 = new A0();
        A0 a2 = a1.clone();
        System.out.println(a2.equals(a1));
    }

}

class A0 implements Cloneable{
    int a;

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof A0)) {
            return false;
        }
        A0 that = (A0) o;

        return this.a == that.a;

    }

    @Override
    public int hashCode() {
        return a;
    }

    @Override
    public A0 clone() throws CloneNotSupportedException {
        A0 a = (A0) super.clone();
        a.a = this.a;
        return a;
    }
}
