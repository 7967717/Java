package ocpjp7.Chapter13_Threads.Listing1315;


/*ocpjp7*/



// class DiceGame just starts the game by starting player threads 
class DiceGame {
    public static void main(String[] s) {
        Player player1 = new Player(Gamers.JANE);
        Player player2 = new Player(Gamers.JOE);
        // don’t forget to set who starts the game
        Dice.setWhoStarts(Gamers.JOE);
        player1.start();
        player2.start();
    }
}