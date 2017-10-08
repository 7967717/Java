package ocpjp7.Chapter11_ExceptionsAndAssertions.Listing1118;


/*ocpjp7*/



class NonTerminatingRecursion {
    // factorial is a recursive call
    static int factorial(int n) {
        int result = 0;
        // Assume that the following termination condition statement is missing ...
        // if(n == 0) return 1;
        result = factorial(n - 1) * n;
        return result;
    }

    public static void main(String... args) {
        System.out.println("factorial of 4 is: " + factorial(4));
    }
}
