package model;

import javax.lang.model.element.Element;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Festival {

    private final String navn;
    private final LocalDate fraDato;
    private final LocalDate tilDato;


    // association 0..* --> Job
    private final ArrayList<Job> jobs = new ArrayList<>();

    public Festival(String navn, LocalDate fraDato, LocalDate tilDato) {
        this.navn = navn;
        this.fraDato = fraDato;
        this.tilDato = tilDato;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDate getFraDato() {
        return fraDato;
    }

    public LocalDate getTilDato() {
        return tilDato;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public Job createJob(String kode, String beskrivelse, LocalDate dato, int timeHonorar, int antalTimer) {
        Job job = new Job(kode, beskrivelse, dato, timeHonorar, antalTimer);
        jobs.add(job);
        return job;
    }

    private int budgetteretJobUdgift() {
        int totalBudget = 0;
        int enkeltBudget;
        for (Job e : jobs) {
            enkeltBudget = e.getAntalTimer() * e.getTimeHonorar();
            totalBudget += enkeltBudget;
        }
        return totalBudget;
    }

    private int realiseretJobUdgift() {
        int enkeltFrivilligBudget = 0;
        int totalFrivilligBudget = 0;
        for (Job j : jobs) {
            for (Vagt v : j.getVagter())
                enkeltFrivilligBudget = j.getTimeHonorar() * v.getTimer();
            totalFrivilligBudget += enkeltFrivilligBudget;
        }
        return totalFrivilligBudget;
    }
}

