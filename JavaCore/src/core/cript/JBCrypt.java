package core.cript;

import org.mindrot.jbcrypt.BCrypt;

/**
 * @author roman.rudenko on 05-Sep-16.
 */
public class JBCrypt {
    public static void main(String[] args) {
        String password = "mypass";

        // Hash a password for the first time
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt());

// gensalt's log_rounds parameter determines the complexity
// the work factor is 2**log_rounds, and the default is 10
//        String hashed = BCrypt.hashpw(password, BCrypt.gensalt(12));

        String candidate = "mypass";
// Check that an unencrypted password matches one that has
// previously been hashed
        if (BCrypt.checkpw(candidate, hashed))
            System.out.println("It matches");
        else
            System.out.println("It does not match");
    }
}
