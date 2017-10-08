package ocpjp7.Chapter11_ExceptionsAndAssertions.Listing1119;

/*ocpjp7*/




import java.io.*;
import java.util.*;

class ThrowsClause1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Reading an integer from the file 'integer.txt': ");
        Scanner consoleScanner = new Scanner(new File("integer.txt"));
        System.out.println("You typed the integer value: " + consoleScanner.nextInt());
    }
}