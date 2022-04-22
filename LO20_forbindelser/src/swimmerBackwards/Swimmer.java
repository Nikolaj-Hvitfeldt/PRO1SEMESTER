package swimmerBackwards;

import java.util.ArrayList;

public class Swimmer {
    private String name;
    private ArrayList<Double> lapTimes;

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

    public double bestLapTime() {
        // TODO: implement!

        double bestTime = 10;
        for (int i = 0; i < getLapTimes().size(); i++) {
            double laps = getLapTimes().get(i);
            if (laps < bestTime) {
                bestTime = laps;

            }
        }
        return bestTime;}}
