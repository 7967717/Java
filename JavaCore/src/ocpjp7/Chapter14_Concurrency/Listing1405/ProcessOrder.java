
/*ocpjp7*/


package ocpjp7.Chapter14_Concurrency.Listing1405;

import java.util.concurrent.*;

// ProcessOrder thread is the master thread overlooking to make sure that the Cook, Helper
// and Attendant are doing their part of the work to complete preparing the food items 
// and complete order delivery 
// To simplify the logic, we assume that each delivery order consists of exactly three food items 
class ProcessOrder {
    public static void main(String[] args) throws InterruptedException {
        // the Phaser is the synchronizer to make food items one-by-one,
        // and deliver it before moving to the next item
        Phaser deliveryOrder = new Phaser(1);

        System.out.println("Starting to process the delivery order ");

        new Worker(deliveryOrder, "Cook");
        new Worker(deliveryOrder, "Helper");
        new Worker(deliveryOrder, "Attendant");

        for (int i = 1; i <= 3; i++) {
            // Prepare, mix and deliver this food item
            deliveryOrder.arriveAndAwaitAdvance();
            System.out.println("Deliver food item no. " + i);
        }
        // work completed for this delivery order, so deregister
        deliveryOrder.arriveAndDeregister();
        System.out.println("Delivery order completed... give it to the customer");
    }
}
