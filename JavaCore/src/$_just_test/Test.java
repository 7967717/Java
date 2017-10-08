package $_just_test;

/**
 * Created by RomanR on 4/9/14.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        boolean toBe = false;
        PrinceOfDenmark hamlet = new PrinceOfDenmark();
        hamlet.tortureYourSelf((toBe || !toBe));
    }
}

class PrinceOfDenmark {
    void tortureYourSelf(boolean mind) {
        if (mind) {
            System.out.println("I will hate everybody including myself!");
        }
        else {
            System.out.println("I will be a good citizen.");
        }
    }
}
