package $_just_test.commons;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author Roman Rudenko on 02-Mar-15.
 */
public class App0 {
    public static void main(String[] args) {
        System.out.println(RandomStringUtils.random(6));
        System.out.println(RandomStringUtils.randomAscii(6));
        System.out.println(RandomStringUtils.randomAlphanumeric(6));
    }
}
