package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Job {

    private final String kode;
    private final String beskrivelse;
    private final LocalDate dato;
    private final int timeHonorar;
    private final int antalTimer;

    // 0..* association <--> Vagt
    private final ArrayList<Vagt> vagter = new ArrayList<>();

    public Job(String kode, String beskrivelse, LocalDate dato, int timeHonorar, int antalTimer) {
        this.kode = kode;
        this.beskrivelse = beskrivelse;
        this.dato = dato;
        this.timeHonorar = timeHonorar;
        this.antalTimer = antalTimer;
    }

    public String getKode() {
        return kode;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public LocalDate getDato() {
        return dato;
    }

    public int getTimeHonorar() {
        return timeHonorar;
    }

    public int getAntalTimer() {
        return antalTimer;
    }

    public ArrayList<Vagt> getVagter() {
        return vagter;
    }

    public Vagt createVagt(int timer) {
        Vagt vagt = new Vagt(timer);
        vagter.add(vagt);
        return vagt;
    }
//    public int ikkeBesatteTimer(){
//}
}
