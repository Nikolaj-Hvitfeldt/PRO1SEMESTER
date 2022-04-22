package craps;

import simple.SimpleGame;

public class CrapsApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the game of Craps.");
        System.out.println();
        CrapsGame game = new CrapsGame();
        game.printRules();
        System.out.println();

        game.playMore();

        System.out.println("Thank you for playing Craps.");
    }
}
