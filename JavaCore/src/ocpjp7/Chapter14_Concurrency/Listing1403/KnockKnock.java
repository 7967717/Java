package ocpjp7.Chapter14_Concurrency.Listing1403;
/*ocpjp7*/


import java.util.concurrent.Exchanger;

// Co-ordinate the silly talk between Duke and CoffeeShop by instantitaing the Exchanger object
// and the CoffeeShop and Duke threads 
class KnockKnock {
    public static void main(String[] args) {
        Exchanger<String> sillyTalk = new Exchanger<String>();
        new CoffeeShopThread(sillyTalk).start();
        new DukeThread(sillyTalk).start();
    }
}