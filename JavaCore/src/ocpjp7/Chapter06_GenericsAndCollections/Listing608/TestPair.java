/*ocpjp7*/


package ocpjp7.Chapter06_GenericsAndCollections.Listing608;

class TestPair {
    public static void main(String[] args) {
        Pair<Integer, String> worldCup = new Pair<>(2010, "South Africa");
        System.out.println("World cup " + worldCup.getFirst() +
                " in " + worldCup.getSecond());
    }
}