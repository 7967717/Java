package ocpjp7.Chapter04_AdvancedClassDesign.Listing402;


/*ocpjp7*/


// Counter class should count the number of instances created from that class
public class Counter {
    private int count; // variable to store the number of objects created

    // for every Counter object created, the default constructor will be called;
    // so, update the counter value inside the default constructor
    public Counter() {
        count++;
    }

    public void printCount() { // method to print the counter value so far
        System.out.println("Number of instances created so far is: " + count);
    }

    public static void main(String[] args) {
        Counter anInstance = new Counter();
        anInstance.printCount();
        Counter anotherInstance = new Counter();
        anotherInstance.printCount();
    }
}
