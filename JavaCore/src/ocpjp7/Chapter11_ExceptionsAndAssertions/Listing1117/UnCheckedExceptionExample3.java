package ocpjp7.Chapter11_ExceptionsAndAssertions.Listing1117;
/*ocpjp7*/




import java.io.*;

class UnCheckedExceptionExample3 {
    public static void main(String[] args) throws FileNotFoundException {
        // if any argument is passed, it would be greater than or equal to one
        if (args.length >= 1) {
            FileInputStream fis = new FileInputStream(args[0]);
        } else {
            System.out.println("Error: No arguments passed in the commandline!");
            System.out.println("Pass the name of the file to open as commandline argument");
        }
    }
}
