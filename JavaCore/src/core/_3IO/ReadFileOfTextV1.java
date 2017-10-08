package core._3IO;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.*;

/**
 * Created by roman.rudenko on 22-Feb-16.
 */
public class ReadFileOfTextV1 {

    public static void main(String[] args) {
        String string = readFile("C:\\temp\\javaIO1.txt", Charset.forName("UTF-8"));

        Map<String, Integer> wordMap = addWordsToMap(string);
        printMap(wordMap);
        System.out.println("--------------------");
        printMap(sortWordsDescending(wordMap));

    }

    private static void printMap(Map<String, Integer> wordMap) {
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static String readFile(String url, Charset encoding) {
        String fileContent = null;
        // Read words from file and put into string
        try {
            fileContent = IOUtils.toString(new FileInputStream(url), encoding);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }

    private static Map<String, Integer> addWordsToMap(String string) {
        String[] wordsArray = getWordArray(string);

        Map<String, Integer> wordMap = new HashMap<String, Integer>();
        final int wordNumber = 1;
        for (String word : wordsArray) {
            if(wordMap.containsKey(word)) {
                wordMap.put(word, (wordMap.get(word) + wordNumber));
            } else {
                wordMap.put(word, wordNumber);
            }
        }
        return wordMap;
    }

    private static String[] getWordArray(String string) {
        // Put words into array
        String[] wordsArray = string.split("\\s+");

        // Remove all non-“word characters”
        for (int i = 0; i < wordsArray.length; i++) {
            wordsArray[i] = wordsArray[i].replaceAll("[^\\p{L}\\p{Nd}]+", "");
        }
        return wordsArray;
    }

    private static Map<String, Integer> sortWordsDescending(Map<String, Integer> unsortedMap) {

        // Convert Map to List
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(unsortedMap.entrySet());

        // Sort list with comparator, to compare the Map values
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // Convert sorted map back to a Map
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext();) {
            Map.Entry<String, Integer> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
