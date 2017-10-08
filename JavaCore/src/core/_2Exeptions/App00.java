package core._2Exeptions;

/**
 * @author roman.rudenko on 05-Aug-16.
 */
public class App00 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ab = new B();

        b.foo();
        try {
            ab.foo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class A {
    void foo() throws Exception {
    }
}

class B extends A {
    void foo() {
        throw new RuntimeException();
    }
}

class C extends A {
    void foo() {
    }
}