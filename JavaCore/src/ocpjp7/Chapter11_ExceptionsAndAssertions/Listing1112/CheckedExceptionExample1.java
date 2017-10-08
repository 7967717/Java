package ocpjp7.Chapter11_ExceptionsAndAssertions.Listing1112;
/*ocpjp7*/




import java.io.*;


class CheckedExceptionExample1 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(args[0]);
    }
}  