package core._6OOP;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author roman.rudenko on 21-Jul-16.
 */
public class App08 implements I1, I2 {


    @Override
    public void foo() {
        System.out.println("Implementing two interfaces");
    }

    public static void main(String[] args) {
        new App08().foo();
        new App08().bar();
    }
}

interface I1 {
    default void bar() {
        System.out.println("I1");
    }

    void foo() throws IOException;
}

interface I2 {
//    default void bar() {
//        System.out.println("I2");
//    }

    void foo() throws SQLException;
}