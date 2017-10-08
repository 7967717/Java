package core._3IO;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * Created by roman on 26.04.15.
 */
public class ReadFileOfTextV0 {
//
//    public List<String> get5TopWords(String filePath) {
//        String words = readFile(filePath);
//        Map<String, Integer> wordMap = sortWords(getWords(words));
//        return //TODO get top 5 map values;
//    }

    private Map<String, Integer> sortWords(List<String> stringList) {
        Map<String, Integer> wordMap = new HashMap<String, Integer>();
        Set<String> wordSet = new HashSet<String>();
        for (String word : stringList) {
            wordMap.put(word, 1);
        }

        for (String word : stringList) {
            if (wordMap.containsKey(word)) {
                int key = wordMap.get(word);
                wordMap.put(word, key++);
            }
        }
        return wordMap;
    }

    private String readFile(String filePath) {
        FileInputStream inputStream = null;
        String words = null;
        try {
            inputStream = new FileInputStream("foo.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            words = IOUtils.toString(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return words;

    }

    private List<String> getWords(String words) {
        String[] wordsArray = words.split("\\s+");
        for (int i = 0; i < wordsArray.length; i++) {
            wordsArray[i] = wordsArray[i].replaceAll("[^\\w]", "");
        }
        return Arrays.asList(wordsArray);
    }
}
