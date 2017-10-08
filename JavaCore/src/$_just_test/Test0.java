package $_just_test;

/**
 * @author roman on 3/20/17.
 */
public class Test0 {
    public static int countCandies(int startingAmount, int newEvery) {
        int rest = 0;
        while(rest <= newEvery) {
            rest = rest + newEvery;
            startingAmount = startingAmount - newEvery;
            startingAmount++;
        }
        rest = rest + startingAmount;
        return rest;
    }

    public static void main(String[] args) {
//        System.out.println(Test0.countCandies(3, 2));
        System.out.println(Test0.countCandies(5, 3));
    }


}
