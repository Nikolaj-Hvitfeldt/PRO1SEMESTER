package controller;

import model.*;
import storage.Storage;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;

public class Controller {

    public static Medarbejder opretMedarbejder(String navn, int antalTimerPrDag, LocalTime typiskMødetid) {
        Medarbejder medarbejder = new Medarbejder(navn, antalTimerPrDag, typiskMødetid);
        Storage.storeMedarbejder(medarbejder);
        return medarbejder;
    }

    public static ArrayList<Medarbejder> getMedarbejdere() {
        return Storage.getMedarbejdere();
    }

    public static void tilføjVagtTilMedarbejder(Medarbejder medarbejder, Vagt vagt) {
        medarbejder.tilføjVagt(vagt);
        vagt.getMedarbejderer().add(medarbejder);
    }

    public static void tilføjFunktionTilMedarbejder(Medarbejder medarbejder, Funktion funktion) {
        medarbejder.tilføjFunktion(funktion);
    }

    //--------------------------------------------------------------------------------------------------------

    public static Vagt opretVagt(String navn, LocalDateTime tidFra, LocalDateTime tidTil) {
        Vagt vagt = new Vagt(navn, tidFra, tidTil);
        Storage.storeVagt(vagt);
        return vagt;
    }

    public static ArrayList<Vagt> getVagter() {
        return Storage.getVagter();
    }

    //--------------------------------------------------------------------------------------------------------

    public static Antal opretAntal(Vagt vagt, int antal, Funktion funktion) {
        Antal antal1 = vagt.opretAntal(antal, funktion);
        vagt.getAntalFunktioner().add(antal1);
        return antal1;
    }

    //--------------------------------------------------------------------------------------------------------

    public static Funktion opretFunktion(String navn) {
        Funktion funktion = new Funktion(navn);
        Storage.storeFunktion(funktion);
        return funktion;
    }

    public static ArrayList<Funktion> getFunktioner() {
        return Storage.getFunktioner();
    }

//--------------------------------------------------------------------------------------------------------

    public static void initStorage(){

        Funktion f1 = opretFunktion("Filetering");
        Funktion f2 = opretFunktion("Grøntsager");
        Funktion f3 = opretFunktion("Sovs og tilbehør");
        Funktion f4 = opretFunktion("Buffetoprydning");

        Medarbejder m1 = opretMedarbejder("Peter",6,LocalTime.of(8,0));
        Medarbejder m2 = opretMedarbejder("Anne",6,LocalTime.of(8,0));
        Medarbejder m3 = opretMedarbejder("Marie", 6,LocalTime.of(10,0));
        Medarbejder m4 = opretMedarbejder("Torben", 8, LocalTime.of(7,0));

        Vagt v1 = opretVagt("Røgede ål til medarbejderne",LocalDateTime.of(2022, Month.JUNE,24,8,0), LocalDateTime.of(2022,Month.JUNE,24,12,30));

        Antal a1 = opretAntal(v1,2,f2);
        Antal a2 = opretAntal(v1,2,f3);
        Antal a3 = opretAntal(v1,2,f4);

        Antal a4 = opretAntal(v1,1,f1);
        Antal a5 = opretAntal(v1,1,f2);
        Antal a6 = opretAntal(v1,1,f4);

        Antal a7 = opretAntal(v1,1,f1);
        Antal a8 = opretAntal(v1,1,f3);

        // Vagt tilføjes til alle medarbejdere
        tilføjVagtTilMedarbejder(m1,v1);
        tilføjVagtTilMedarbejder(m2,v1);
        tilføjVagtTilMedarbejder(m3,v1);
        tilføjVagtTilMedarbejder(m4,v1);

        //Peters funktioner tildeles
        tilføjFunktionTilMedarbejder(m1,f2);
        tilføjFunktionTilMedarbejder(m1,f3);
        tilføjFunktionTilMedarbejder(m1,f4);

        //Annes funktiner tildeles
        tilføjFunktionTilMedarbejder(m2,f2);
        tilføjFunktionTilMedarbejder(m2,f3);
        tilføjFunktionTilMedarbejder(m2,f4);

        //Maries funktioner tildeles
        tilføjFunktionTilMedarbejder(m3,f1);
        tilføjFunktionTilMedarbejder(m3,f2);
        tilføjFunktionTilMedarbejder(m3,f4);

        //Torbens funktioner tildeles
        tilføjFunktionTilMedarbejder(m4,f1);
        tilføjFunktionTilMedarbejder(m4,f3);
    }
}



