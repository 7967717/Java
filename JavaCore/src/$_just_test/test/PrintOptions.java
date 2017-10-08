package $_just_test.test;

/**
 * Created by RomanR on 5/22/14.
 */
public class PrintOptions {
    public static void main(String[] args) {
        System.out.println("Options selected:");

        for (int i = 0; i < args.length; i++)
            if (args[i].startsWith(" "))
                System.out.println(" " + args[i].substring(1));
    }
}
