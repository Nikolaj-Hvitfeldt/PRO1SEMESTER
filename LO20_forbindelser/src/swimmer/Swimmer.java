package swimmer;

import java.util.ArrayList;

public class Swimmer {
    private String name;
    private ArrayList<Double> lapTimes;
    private TrainingPlan trainingPlan;

    public Swimmer(String name, ArrayList<Double> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getLapTimes() {
        return lapTimes;
    }

    /**
     * Note: Nullable return value.
     */
    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }

    /**
     * Pre: This swimmer is not connected to a TrainingPlan.
     */
    public void setTrainingPlan(TrainingPlan trainingPlan) {
        this.trainingPlan = trainingPlan;
    }

    /**
     * Pre: This swimmer is connected to a TrainingPlan.
     */
    public void removeTrainingPlan() {
        this.trainingPlan = null;
    }

    /**
     * Return the fastest lap time.
     */
    public double bestLapTime() {
        // TODO: implement!

        double bestTime = 10;
        for (int i = 0; i < getLapTimes().size(); i++) {
            double laps = getLapTimes().get(i);
            if (laps < bestTime) {
                bestTime = laps;

            }
        }
        return bestTime;
    }

    public int allTrainingHours() {
        int waterHours = getTrainingPlan().getWeeklyWaterHours();
        int strengthHours = getTrainingPlan().getWeeklyStrengthHours();
        int totalHours = waterHours + strengthHours;
        return totalHours;
    }
}
