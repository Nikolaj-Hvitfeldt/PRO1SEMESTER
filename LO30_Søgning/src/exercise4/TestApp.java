package exercise4;
import java.util.ArrayList;

public class TestApp {

    public static void main(String[] args) {

        Player putin = new Player("Putin", 170, 90, 7);
        Player stalin = new Player("Stalin", 165, 120, 6);
        Player mao = new Player("Mao", 200, 140, 5);
        Player mussolini = new Player("Mussolini", 140, 50, 4);
        Player lenin = new Player("Lenin", 175, 89, 3);
        Player jongUn = new Player("Jong-Un", 169, 130, 2);
        Player hitler = new Player("Hitler", 150, 69, 1);

        ArrayList<Player> players = new ArrayList<>();
        players.add(putin);
        players.add(stalin);
        players.add(mao);
        players.add(mussolini);
        players.add(lenin);
        players.add(jongUn);
        players.add(hitler);

        System.out.println(findPlayerLinea(players, 4));
        System.out.println(findPlayerLinea(players, 9));
        System.out.println(findPlayerBinary(players,2));


    }

    public static Player findPlayerLinea(ArrayList<Player> players, int score) {
        Player player = null;
        int i = 0;
        while (player == null && i < players.size()) {
            Player k = players.get(i);
            if (k.getScoredGoals() == score)
                player = k;
            else
                i++;
        }
        return player;
    }

    public static Player findPlayerBinary(ArrayList<Player> players, int score) {
        Player player = null;
        int left = 0;
        int right = players.size() - 1;
        while (player == null && left <= right) {
            int middle = (left + right) / 2;
            Player p = players.get(middle);
            if (p.getScoredGoals() == score)
                player = p;
            else if (p.getScoredGoals() < score)
                right = middle - 1;
            else
                left = middle + 1;
        }
        return player;
    }
}
