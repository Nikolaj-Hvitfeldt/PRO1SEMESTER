package ex_3;

import java.util.ArrayList;

public class PlayerApp {
    public static void main(String[] args) {

        Player a = new Player("Mogens ",20,22);
        Player b = new Player("Karsten ",88,99);
        Player c = new Player("Gilbert ", 23,69);
        Player d = new Player("Ahmad ", 19,54);

        Team AGF = new Team("AGF");

        AGF.addPlayer(a);
        AGF.addPlayer(b);
        AGF.addPlayer(c);
        AGF.addPlayer(d);
        AGF.printPlayers();
        System.out.println(AGF.calcAverageAge());
        System.out.println(AGF.totalScore());
    }
}
