package core._1procedural;

/**
 * Created by RomanR on 10-Jun-14.
 */
public class App10 {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 8, 9, 10, 11, 12};
        String s = "";
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println("if " + i);
                s = s + arr[i] + ".";
                break;
            } else {
                System.out.println("else " + i);
                s = s + arr[i] + ", ";
            }
        }
        System.out.println(s);
    }
}
