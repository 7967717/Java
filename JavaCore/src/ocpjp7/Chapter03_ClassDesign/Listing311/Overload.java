package ocpjp7.Chapter03_ClassDesign.Listing311;


/*ocpjp7*/


class Overloaded {
    public static void aMethod(long val1, int val2) {
        System.out.println("long, int");
    }

    public static void aMethod(int val1, long val2) {
        System.out.println("int, long");
    }

    public static void main(String[] args) {
//    		aMethod(9, 10);
    }
}