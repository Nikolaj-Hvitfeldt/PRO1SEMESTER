package swimmerBackwards;

import java.util.ArrayList;

public class TrainingPlan {
    private char level;
    private int weeklyWaterHours;
    private int weeklyStrengthHours;
    private ArrayList<Swimmer> swimmers;


    public TrainingPlan(char level, int weeklyWaterHours, int weeklyStrengthHours) {
        this.level = level;
        this.weeklyWaterHours = weeklyWaterHours;
        this.weeklyStrengthHours = weeklyStrengthHours;
    }


    /**
     * Note: Nullable return value.
     */
    public ArrayList<Swimmer> getSwimmer() {
        return swimmers;
    }

    /**
     * Pre: This person is not connected to a TrainingPlan.
     */
    public void addSwimmer(Swimmer swimmer) {
        swimmers.add(swimmer);
    }

    /**
     * Pre: This person is connected to a TrainingPlan.
     */
    public void removeSwimmer(Swimmer swimmer) {
        swimmers.remove(swimmer);
    }

    public char getLevel() {
        return level;
    }

    public int getWeeklyStrengthHours() {
        return weeklyStrengthHours;
    }

    public int getWeeklyWaterHours() {
        return weeklyWaterHours;
    }
}
