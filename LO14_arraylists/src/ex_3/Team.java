package ex_3;

import com.sun.source.doctree.SummaryTree;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> playerList;

    public Team(String name) {
        this.name = name;
        playerList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return playerList;
    }

    public void addPlayer(Player p) {
        playerList.add(p);
    }

    public void printPlayers() {
        for (Player element : playerList) {
            System.out.println("Name: " + element.getName() + " Age: " + element.getAge() + " Score: " + element.getScore());
            System.out.println();
        }
    }

    public double calcAverageAge() {
        double sum = 0;
        for (Player age : playerList) {
            sum += age.getAge();
        }
        sum = sum / playerList.size();
        return sum;
    }

    public int totalScore() {
        int sum = 0;
        for (Player score : playerList) {
            sum += score.getScore();
        }
        return sum;
    }
    public int calcOldPlayerScore(int ageLimit){
        int total = 0;
        for(Player element : playerList){
            if (element.getAge() >= ageLimit) {
                total += element.getScore();
            }
        }
        return total;
    }
    public int maxScore(){
        int maxScore = 0;
        for(Player element : playerList){
            if(element.getScore()>maxScore){
                maxScore = element.getScore();
            }
        }
        return maxScore;
    }
    public ArrayList<String> bestPlayerNames(){
        ArrayList<String> names = new ArrayList<>();
        int maxScore = maxScore();
        for(Player element : playerList){
            if (element.getScore() == maxScore) {
                names.add(element.getName());
            }
        }
        return names;
    }
}