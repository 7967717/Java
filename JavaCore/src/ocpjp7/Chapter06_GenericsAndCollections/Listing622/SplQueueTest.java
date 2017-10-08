package ocpjp7.Chapter06_GenericsAndCollections.Listing622;


/*ocpjp7*/


class SplQueueTest {
    public static void main(String[] args) {
        SplQueue splQ = new SplQueue();
        splQ.addInQueue("Harrison");
        splQ.addInQueue("McCartney");
        splQ.addInQueue("Starr");
        splQ.addInQueue("Lennon");

        splQ.printQueue();
        splQ.removeFront();
        splQ.removeBack();
        splQ.printQueue();
    }
}