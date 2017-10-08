package coursera;

import java.awt.geom.Arc2D;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by roman.rudenko on 17-Sep-15.
 */
public class CsvParsing {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File("C:\\Users\\roman.rudenko\\Documents\\MyProjects\\core\\src\\zresources\\LifeExpectancyWorldBankModule3.csv"));
//        System.out.println(Arrays.asList(loadStrings(new BufferedReader(new InputStreamReader(is)))));
//        System.out.println(Arrays.asList(loadStrings(new BufferedReader(new InputStreamReader(is)))));
        System.out.println(getStringsFromCsv(new BufferedReader(new InputStreamReader(is))));
    }

    public static Map<String, Integer> getStringsFromCsv(BufferedReader reader) throws IOException {
        Map<String, Integer> map = new TreeMap<>();
        String line = "";

        while ((line = reader.readLine()) != null){
            String[] string = line.split(",");
            int lifeExp = 0;
            try {
                lifeExp = (int) Double.parseDouble(string[5]);
            } catch (NumberFormatException e) {
                continue;
            }
            map.put(string[3], lifeExp);
        }
        return map;
    }

    public static String[] loadStrings(BufferedReader reader) {
        try {
            String[] e = new String[100];
            int lineCount = 0;

            String[] output;
            for(String line = null; (line = reader.readLine()) != null; e[lineCount++] = line) {
                if(lineCount == e.length) {
                    output = new String[lineCount << 1];
                    System.arraycopy(e, 0, output, 0, lineCount);
                    e = output;
                }
            }

            reader.close();
            if(lineCount == e.length) {
                return e;
            } else {
                output = new String[lineCount];
                System.arraycopy(e, 0, output, 0, lineCount);
                return output;
            }
        } catch (IOException var5) {
            var5.printStackTrace();
            return null;
        }
    }
}
