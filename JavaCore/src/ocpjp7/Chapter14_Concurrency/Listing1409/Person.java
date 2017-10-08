package ocpjp7.Chapter14_Concurrency.Listing1409;
/*ocpjp7*/


import java.util.concurrent.locks.Lock;

// Each Person is an independent thread; their access to the common resource
// (the ATM machine in this case) needs to be synchronized using a lock  
class Person extends Thread {
    private Lock machine;

    public Person(Lock machine, String name) {
        this.machine = machine;
        this.setName(name);
        this.start();
    }

    public void run() {
        try {
            System.out.println(getName() + " waiting to access an ATM machine");
            machine.lock();
            System.out.println(getName() + " is accessing an ATM machine");
            Thread.sleep(1000); // simulate the time required for withdrawing amount
        } catch (InterruptedException ie) {
            System.err.println(ie);
        } finally {
            System.out.println(getName() + " is done using the ATM machine");
            machine.unlock();
        }
    }
}
