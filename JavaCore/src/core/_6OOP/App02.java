package core._6OOP;

/**
 * Created by RomanR on 04-Jun-14.
 */
public class App02 {
    public static class StaticNested {}
    public class Inner {}
}

class Test {
    public static void main(String[] args) {
        App02.StaticNested ref = new App02.StaticNested();
        App02 ref1 = new App02();
        App02.Inner ref2 = ref1.new Inner();
        App02.Inner ref3 = new App02().new Inner();

    }
}
