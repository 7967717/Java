
/*ocpjp7*/



package ocpjp7.Chapter13_Threads.Listing1314;

// This class instantiates two threads - CoffeeMachine and Waiter threads
// and these two threads interact with each other through wait/notify 
// till you terminate the application explicitly by pressing Ctrl-C
class CoffeeShop {
    public static void main(String[] s) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Waiter waiter = new Waiter();
        coffeeMachine.start();
        waiter.start();
    }
}