package core._1procedural;

/**
 * Created by RomanR on 16-Jun-14.
 */
public class App11 {
    public static void main(String[] args) {
//        StopWatch
        System.out.println(threeSum(new int[]{30, -40, -20, -10, 40, 0, 10, 5}));
    }

    static int threeSum(int[] arr) {
        int count = 0;
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            for (int j = i+1; j < l; j++) {
                for (int k = j+1; k < l; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
