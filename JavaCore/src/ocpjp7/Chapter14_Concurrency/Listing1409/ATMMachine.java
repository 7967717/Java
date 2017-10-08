package ocpjp7.Chapter14_Concurrency.Listing1409;
/*ocpjp7*/


import java.util.concurrent.locks.*;

// This class simulates a situation where only one ATM machine is available and 
// and five people are waiting to access the machine. Since only one person can 
// access an ATM machine at a given time, others wait for their turn 
class ATMMachine {
    public static void main(String[] args) {
        // A person can use a machine again, and hence using a "reentrant lock"
        Lock machine = new ReentrantLock();

        // list of people waiting to access the machine
        new Person(machine, "Mickey");
        new Person(machine, "Donald");
        new Person(machine, "Tom");
        new Person(machine, "Jerry");
        new Person(machine, "Casper");
    }
}