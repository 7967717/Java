package core._3IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

/**
 * @author roman.rudenko on 14-Jun-16.
 */
public class App01 {
    public static void main(String[] args) {
        String user = null, password = null;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buf_in = new BufferedReader(reader);

        try {
            System.out.print("Input Oracle user name: ");
            user = buf_in.readLine();
            System.out.println(user);
            System.out.print("Input Oracle user password: ");
            password = buf_in.readLine();
            System.out.println(password);
        } catch (IOException ex) {

        }
    }
}
