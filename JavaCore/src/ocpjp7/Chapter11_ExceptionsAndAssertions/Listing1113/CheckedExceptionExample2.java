package ocpjp7.Chapter11_ExceptionsAndAssertions.Listing1113;
/*ocpjp7*/




import java.io.*;

class CheckedExceptionExample2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(args[0]);
    }
}