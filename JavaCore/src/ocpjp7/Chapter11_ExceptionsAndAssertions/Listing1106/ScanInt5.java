package ocpjp7.Chapter11_ExceptionsAndAssertions.Listing1106;

/*ocpjp7*/



// A program that illustrates multi-catch blocks 

import java.util.*;

class ScanInt5 {
    public static void main(String[] args) {
        String integerStr = "";
        System.out.println("The string to scan integer from it is: " + integerStr);
        Scanner consoleScanner = new Scanner(integerStr);
        try {
            System.out.println("The integer value scanned from string is: " + consoleScanner.nextInt());
        } catch (NoSuchElementException | IllegalStateException multie) {
            System.out.println("Error: An error occured while attempting to scan the integer");
        }
    }
}