package bloch.BlochSengleton;

/**
 * @author Roman Rudenko on 30-Mar-15.
 */
public class App01 {
    private static App01 instance;
    private App01(){}

    public static App01 getInstance (){
        return instance == null ? new App01() : instance;
    }
}
