package model;

public class Vagt {

    private final int timer;

    // association 1 Frivillig <-->
    Frivillig frivillig;

    // association 1 Job <-->
    Job job;

    public Vagt(int timer) {
        this.timer = timer;
    }

    public int getTimer() {
        return timer;
    }

    public Frivillig getFrivillig() {
        return frivillig;
    }

    public Job getJob() {
        return job;
    }

}
