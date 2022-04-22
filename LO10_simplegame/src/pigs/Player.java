package pigs;

import java.util.Scanner;

public class Player

{

    private String name;
    private int score =0;
    private int nr;

    Player(int nr_in)
    {
        nr = nr_in;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

   public void scanName()
   {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Player " + nr +". Please enter your name: ");
       name = scanner.nextLine();

       System.out.println("Player " + nr +": "+name);
   }

    public void updateScore(int score_in)
    {
        score += score_in;
    }

}

