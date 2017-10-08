package ocpjp7.Chapter11_ExceptionsAndAssertions.Listing1121;
/*ocpjp7*/




import java.io.*;
import java.util.*;

class ThrowsClause3 {
    // since this method does not handle FileNotFoundException,
    // the method must declare this exception in the throws clause
    public int readIntFromFile() throws FileNotFoundException {
        Scanner consoleScanner = new Scanner(new File("integer.txt"));
        return consoleScanner.nextInt();
    }

    // since readIntFromFile() throws FileNotFoundException and main() does not handle
    // it, the main() method declares this exception in its throws cause
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Reading an integer from the file 'integer.txt': ");
        System.out.println("You typed the integer value: " + new ThrowsClause3().readIntFromFile());
    }
}