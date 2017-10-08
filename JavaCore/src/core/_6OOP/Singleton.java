package core._6OOP;

/**
 * Created by RomanR on 6/5/14.
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static synchronized Singleton getInstance (){
        if (singleton == null) {
            singleton = new Singleton();
        }
          return singleton;
    }
}

class Singleton1 {
    public static final Singleton1 SINGLETON = new Singleton1();

    private Singleton1() {
    }
}