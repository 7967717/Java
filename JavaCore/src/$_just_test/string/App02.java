package $_just_test.string;

/**
 * Created by roman.rudenko on 02-Nov-15.
 */
public class App02 {

    public static void main(String[] args) {
        System.out.println(compare("cat", 'c', 'f'));
        System.out.println(compare0("cat", 'c', 'f'));
    }

    private static String compare(String word, char a, char b){
        char[] array = word.toCharArray();
        for (char c : array){
            if(c == a) {
                c = b;
            }
        }
        return new String(array);
    }

    private static String compare0(String word, char a, char b){
        char[] array = word.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == a) {
                array[i] = b;
            }
        }
        return new String(array);
    }
}
