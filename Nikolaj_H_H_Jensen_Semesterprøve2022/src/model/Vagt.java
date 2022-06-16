package model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;

public class Vagt {

    private final String navn;
    private final LocalDateTime tidFra;
    private final LocalDateTime tidTil;

    //Association 0..* <--> Medarbejder
    ArrayList<Medarbejder> medarbejderer = new ArrayList<>();

    //Association 0..* --> Antal
    ArrayList<Antal> antalFunktioner = new ArrayList<>();

    public Vagt(String navn, LocalDateTime tidFra, LocalDateTime tidTil) {
        this.navn = navn;
        this.tidFra = tidFra;
        this.tidTil = tidTil;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDateTime getTidFra() {
        return tidFra;
    }

    public LocalDateTime getTidTil() {
        return tidTil;
    }

    public ArrayList<Medarbejder> getMedarbejderer() {
        return medarbejderer;
    }

    public ArrayList<Antal> getAntalFunktioner() {
        return antalFunktioner;
    }

    public Antal opretAntal(int antal, Funktion funktion) {
        Antal antal1 = new Antal(antal, funktion);
        antalFunktioner.add(antal1);
        return antal1;
    }

    public void tilføjAntal(Antal antal) {
        antalFunktioner.add(antal);
    }

    public void fjernAntal(Antal antal) {
        antalFunktioner.remove(antal);
    }

    public Medarbejder findMedarbejder(LocalTime tidspunkt, int antalTimer) {
        Medarbejder medarbejder = null;
        for (Medarbejder e : medarbejderer) {
            if (e.getAntalTimerPrDag() >= antalTimer && e.getTypiskMødetid().equals(tidspunkt)) {
                medarbejder = e;
            }
        }
        return medarbejder;
    }

    public int beregnTimeforbrug() {
        return (int) this.getTidFra().until(getTidTil(), ChronoUnit.HOURS) * this.getMedarbejderer().size();
    }

    // Hvis der er ønsket en Arraylist af Medarbejdere i opg 4
//    public ArrayList<Medarbejder> antalMedarbejdereMedFunktion(Funktion funktion){
//        ArrayList<Medarbejder> medarbejdereMedFunktion = new ArrayList<>();
//        for(Medarbejder e: medarbejderer){
//            if(e.getFunktioner().contains(funktion)){
//                medarbejdereMedFunktion.add(e);
//            }
//        }
//        return medarbejdereMedFunktion;
//    }

    // Hvis der ønskes en int i opg 4
    public int antalMedarbejdereMedFunktion(Funktion funktion) {
        int antalMedarbejdere = 0;
        for (Medarbejder e : medarbejderer) {
            if (e.getFunktioner().contains(funktion)) {
                antalMedarbejdere++;
            }
        }
        return antalMedarbejdere;
    }

    public Medarbejder[] skalAdviseresOmMødetid() {
        Medarbejder[] medarbejdereMedSenMødetid = new Medarbejder[10];
        for (Medarbejder e : medarbejderer) {
            LocalDateTime normalMødetid = LocalDateTime.from(LocalTime.of(this.tidFra.getHour(), this.tidFra.getMinute()));
            if (!normalMødetid.equals(this.tidFra)) {
                Arrays.fill(medarbejdereMedSenMødetid, e);
            }
        }
        return medarbejdereMedSenMødetid;
    }

    @Override
    public String toString() {
        return navn;
    }


    //Koden fungerer ikke :)
    public String status() {
        String str = "Status: Ressourcer ikke tildelt";
        for (Antal a : antalFunktioner) {
            for (Medarbejder m : medarbejderer)
                if (m.getFunktioner().contains(a.getFunktion()) && a.getAntal() <= antalMedarbejdereMedFunktion(a.getFunktion()))
                    str = "Status: Ressourcer tildelt";
        }
        return str;
    }

//append(status()).append("\n")

    public String valgtVagtToString() {
        StringBuilder str = new StringBuilder();
        str.append("Navn : ").append(navn).append("\n").append("Fra: ").append(tidFra).append("\n").append("Til: ").append(tidTil).append("\n").append(status()).append("\n").append("Tilknyttede medarbejdere: ").append("\n");
        for (Medarbejder e : medarbejderer) {
            str.append(e.getNavn()).append(", ");
        }
        return str.toString();
    }
}

