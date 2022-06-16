package model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Medarbejder {

    private final String navn;
    private final int antalTimerPrDag;
    private final LocalTime typiskMødetid;

    //Association 0..*--> Funktion
    ArrayList<Funktion> funktioner = new ArrayList<>();

    //Association 0..* <--> Vagt
    ArrayList<Vagt> vagter = new ArrayList<>();

    public Medarbejder(String navn, int antalTimerPrDag, LocalTime typiskMødetid) {
        this.navn = navn;
        this.antalTimerPrDag = antalTimerPrDag;
        this.typiskMødetid = typiskMødetid;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntalTimerPrDag() {
        return antalTimerPrDag;
    }

    public LocalTime getTypiskMødetid() {
        return typiskMødetid;
    }

    public ArrayList<Funktion> getFunktioner() {
        return funktioner;
    }

    public ArrayList<Vagt> getVagter() {
        return vagter;
    }
//
//    public void tilføjVagt(Vagt vagt){
//        vagter.add(vagt);
//    }

    public void tilføjVagt(Vagt vagt) {
        try {
            for (Vagt e : vagter) {
                if (vagt.getTidFra().isAfter(e.getTidTil()) && vagt.getTidTil().isBefore(e.getTidFra())) {
                    vagter.add(vagt);
                }
            }
        } catch (RuntimeException runtimeException) {
            System.out.println("Medarbejder allerede tildelt vagt i det tidsrum");
            runtimeException.printStackTrace();
        }
    }

    public void fjernVagt(Vagt vagt) {
        vagter.remove(vagt);
    }

    public void tilføjFunktion(Funktion funktion) {
        funktioner.add(funktion);
    }

    public void fjernFunktion(Funktion funktion) {
        funktioner.remove(funktion);
    }

    @Override
    public String toString() {
        return navn + ", Typisk mødetid : " + typiskMødetid;
    }
}
