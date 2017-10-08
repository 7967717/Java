package ocpjp7.Chapter03_ClassDesign.Listing306;


/*ocpjp7*/


class HappyBirthday {
    // overloaded wish method with String as an argument
    public static void wish(String name) {
        System.out.println("Happy birthday " + name + "!");
    }

    // overloaded wish method with no arguments; this method in turn invokes wish(String) method
    public static void wish() {
        wish("to you");
    }

    public static void main(String[] args) {
        wish();
        wish("dear James Gosling");
    }
}