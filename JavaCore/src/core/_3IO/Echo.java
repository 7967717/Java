package core._3IO;

import java.io.Console;

/**
 * @author roman.rudenko on 02-Jun-16.
 */
public class Echo {
    public static void main(String[] args) {
// get the System console object
        Console console = System.console();
        if (console == null) {
            System.err.println("Cannot retrive console object - are you running your application from an IDE? Exiting the application ... ");
            System.exit(-1); // terminate the application
        }
// read a line and print it through printf
        String input;
        do {
            input = console.readLine();
            console.printf(input);
            console.printf("\n");
        } while (!input.equals("quit"));
    }
}
