package storage;

import model.*;

import java.util.ArrayList;

public class Storage {

    private final static ArrayList<Vagt> vagter = new ArrayList<>();
    private final static ArrayList<Frivillig> frivillige = new ArrayList<>();
    private final static ArrayList<Job> jobs = new ArrayList<>();
    private final static ArrayList<Festival> festivaller = new ArrayList<>();
    private final static ArrayList<FrivilligForening> frivilligForenininger = new ArrayList<>();

    // ---------------------------------------------------------------------

    public static ArrayList<Vagt> getVagter(){
        return vagter;
    }

    public static void storeVagter(Vagt vagt) {
        vagter.add(vagt);
    }

    //----------------------------------------------------------------------

    public static ArrayList<Frivillig> getFrivillige(){
        return frivillige;
    }

    public static void storeFrivillige(Frivillig frivillig) {
        frivillige.add(frivillig);
    }

    //----------------------------------------------------------------------

    public static ArrayList<Job> getJobs(){
        return jobs;
    }

    public static void storeJobs(Job job) {
        jobs.add(job);
    }

    //----------------------------------------------------------------------

    public static ArrayList<Festival> getFestivaller(){
        return festivaller;
    }

    public static void storeFestivaller(Festival festival) {
        festivaller.add(festival);
    }

    //----------------------------------------------------------------------

    public static ArrayList<FrivilligForening> getFrivilligForenininger(){
        return frivilligForenininger;
    }

    public static  void storeFrivilligForeninger(FrivilligForening frivilligForening){
        frivilligForenininger.add(frivilligForening);
    }
}
