package $_just_test.string;

import java.math.BigDecimal;

/**
 * @author Roman Rudenko on 19-Mar-15.
 */
public class App01 {
    public static void main(String[] args) {
        BigDecimal first = new BigDecimal(-100000f);

        System.out.println(first.toEngineeringString());
        System.out.println(first.toPlainString());
        System.out.println(first.toString());
    }
}
