package $_just_test.regex;

/**
 * @author roman.rudenko on 01-Jun-16.
 */

// This program demonstrates the use of format specifiers in printf
public class StringFormatting {
        static void line() {
            System.out.
                    println("-----------------------------------------------------------------");
        }
        static void printHeader() {
            System.out.printf("%-15s \t %s \t %s \t %s \n",
                    "Player", "Matches", "Goals", "Goals per match");
        }
        static void printRow(String player, int matches, int goals) {
            System.out.printf("%-15s \t %5d \t\t %d \t\t %.1f \n",
                    player, matches, goals, ((float)goals/(float)matches));
        }
        public static void main(String[] str) {
            StringFormatting.line();
            StringFormatting.printHeader();
            StringFormatting.line();
            StringFormatting.printRow("Demando", 100, 122);
            StringFormatting.printRow("Mushi", 80, 100);
            StringFormatting.printRow("Peale", 150, 180);
            StringFormatting.line();
        }
}
