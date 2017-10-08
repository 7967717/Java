package core._1procedural;

import java.util.Date;

/**
 * Created by RomanR on 24-Oct-14.
 */
public class App14GC {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory " + runtime.totalMemory());
        System.out.println("Free memory1 " + runtime.freeMemory());

        Date d = null;
        for (int i = 0; i < 900_000_000; i++) {
            d = new Date();
            d = null;
        }
        System.out.println("Free memory2 " + runtime.freeMemory());
        runtime.gc();
        System.out.println("Free memory3 " + runtime.freeMemory());
    }
}
