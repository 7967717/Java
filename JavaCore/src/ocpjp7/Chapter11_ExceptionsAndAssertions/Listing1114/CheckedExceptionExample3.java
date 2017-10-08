package ocpjp7.Chapter11_ExceptionsAndAssertions.Listing1114;
/*ocpjp7*/




import java.io.*;

class CheckedExceptionExample3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: There is no file that exists with name " + args[0]);
            System.out.println("Pass a valid file name as commandline argument!");
        }
    }
}