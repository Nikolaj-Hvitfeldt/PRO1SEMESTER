package craps;

import simple.DiceThrower;


import java.util.Scanner;

public class CrapsGame {
    private craps.DiceThrower thrower = new craps.DiceThrower();
    private boolean finished = false;
    private int gameCount = 0;
    private int wonCount = 0;


    /**
     * Simulates playing one game of craps.
     */
    public void play() {
        Scanner scanner1 = new Scanner(System.in);
        simple.DiceThrower thrower = new DiceThrower();

        boolean finished = false;
        thrower.roll();
        System.out.println(thrower.rollDescription());
        int firstRoll;
        firstRoll = thrower.sum();
        if (firstRoll == 7 || firstRoll == 11) {
            wonCount++;
            printGameWon();
            finished = true;
        } else if (firstRoll == 2 || firstRoll == 3 || firstRoll == 12) {
            printGameLost();
            finished = true;}

            while (!finished) {
                thrower.roll();
                System.out.println(thrower.rollDescription());
                if (thrower.sum() == firstRoll) {
                    wonCount++;
                    printGameWon();
                    finished = true;
                }
                if (thrower.sum() == 7) {
                    printGameLost();
                    finished = true;
                }
            }
        }


    /**
     * Prints a 'You have won' message.
     */
    public void printGameWon() {
        // TODO
        System.out.println("You have won!");
    }

    /**
     * Prints a 'You have lost' message.
     */
    public void printGameLost() {
        // TODO
        System.out.println("You have lost! :(");
    }

    /**
     * Prints the rules of craps.
     */
    public void printRules() {
        //
        System.out.println("In the game a player throws 2 dice. The first throw is called 'the come out roll'. The player wins, if\n" +
                "the sum of the dice in the come out roll is 7 or 11. The player loses, if the sum is 2, 3 or 12. If the\n" +
                "sum is something else (that is, 4, 5, 6, 8, 9 or 10), the sum is set as the player's 'point'. The player\n" +
                "will now continue throwing the dice until he has lost or won. A sum equal his 'point' is a win, and a\n" +
                "sum equal 7 is a loss.");
    }
    public void playMore() {
        boolean playAgain = true;
        Scanner scanner1 = new Scanner(System.in);
        while(playAgain)
        {
            finished = false;
            play();
            gameCount++;
            int lostCount = gameCount-wonCount;
            double winrate = (double)wonCount/(double)gameCount;
            System.out.println("You have played " + gameCount + " Games, won " + wonCount+ " your winrate is: " + winrate);
            System.out.println("Play again? (Y/n) ");
            String answer = scanner1.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                playAgain = true;
            }
        }
        scanner1.close();
    }
}
