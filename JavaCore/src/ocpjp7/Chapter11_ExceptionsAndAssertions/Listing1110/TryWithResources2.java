package ocpjp7.Chapter11_ExceptionsAndAssertions.Listing1110;
/*ocpjp7*/




import java.util.*;

class TryWithResources2 {
    public static void main(String[] args) {
        System.out.println("Type an integer in the console: ");
        try (Scanner consoleScanner = new Scanner(System.in)) {
            System.out.println("You typed the integer value: " + consoleScanner.nextInt());
        }
    }
}
