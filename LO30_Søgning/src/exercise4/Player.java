package exercise4;

public class Player {

    private String name;
    private int height;
    private int weight;
    private int scoredGoals;

    public Player(String name, int height, int weight, int scoredGoals) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.scoredGoals = scoredGoals;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    @Override
    public String toString() {
            String str = String.format("Player: %s Height: %d Weight: %d Scored Goals %d", name, height,weight,scoredGoals);
            return str;
    }
}
