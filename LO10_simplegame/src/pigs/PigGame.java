package pigs;


import java.util.Scanner;

public class PigGame {

    private Player p1 = new Player(1);
    private Player p2 = new Player(2);
    private boolean p1turn = true;
    private Die die = new Die();
    private int goal;

    public PigGame(int goal) {
        this.goal = goal;
    }


    public boolean isGameWon() {
        if (p1.getScore() >= goal || p2.getScore() >= goal) {
            return true;
        }

        return false;
    }

    public boolean rollAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Roll Again? (Y/n) ");
        String answer = scanner.nextLine();

        return answer.equalsIgnoreCase("n");
    }

    public void play() {
        p1.scanName();
        p2.scanName();


        while (!isGameWon()) {
            int tempScore = 0;
            boolean doneRolling = false;

            while (!doneRolling) {
                die.roll();
                if (p1turn) {
                    System.out.print(p1.getName() + "'s turn: ");
                    System.out.println("");
                } else {
                    System.out.print(p2.getName() + "'s turn: ");
                    System.out.println("");
                }
                die.printFace();

                if (die.getFaceValue() == 1) {
                    tempScore = 0;
                    System.out.println("Too bad you lost your turn!");
                    System.out.println("");
                    doneRolling = true;
                } else {
                    System.out.println("");
                    tempScore += die.getFaceValue();
                    printScores(tempScore);
                    doneRolling = rollAgain();


                    if (doneRolling) {
                        if (p1turn) {
                            p1.updateScore(tempScore);


                        } else {
                            p2.updateScore(tempScore);

                            doneRolling = true;

                        }
                    }

                }
            }   //END of doneRolling while loop
            if (p1turn) {
                System.out.println(p1.getName() + "'s current score is: " + p1.getScore());
                System.out.println("");
            } else {
                System.out.println(p2.getName() + "'s current score is: " + p2.getScore());
                System.out.println("");
            }
            p1turn = !p1turn;

        } //End of gameOverLoop
        if(!p1turn)
        {
            System.out.println(p1.getName() +" has won the game!");
        }
        else
        {
            System.out.println(p2.getName() + " has won the game!");
        }
    }
    public void printScores(int tempscore){
        int totalScore = 0;
        if(p1turn)
        {
            totalScore = tempscore+ p1.getScore();
        }
        else
        {
            totalScore = tempscore + p2.getScore();
        }
        System.out.printf("Your temporary score is %d.%nYour total score would be %d %n", tempscore, totalScore);
    }


}
