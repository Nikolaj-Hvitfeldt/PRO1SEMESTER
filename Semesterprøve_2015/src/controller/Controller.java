package controller;

import model.Deltagelse;
import model.Kamp;
import model.Profspiller;
import model.Spiller;
import storage.Storage;

import java.time.LocalDate;
import java.time.LocalTime;

public class Controller {

    public static Kamp opretKamp(String sted, LocalDate dato, LocalTime tid) {
        Kamp kamp = new Kamp(sted, dato, tid);
        Storage.storeKampe(kamp);
        return kamp;
    }

    public static Deltagelse opretDeltagelse(boolean afbud, String begrundelse, Spiller spiller){
        Deltagelse deltagelse = new Deltagelse(afbud, begrundelse, spiller);
        return deltagelse;
    }

    public static Spiller opretSpiller(String navn, int årgang){
        Spiller spiller = new Spiller(navn, årgang);
        Storage.storeSpiller(spiller);
        return spiller;
    }

    public static Profspiller opretProfspiller(String navn, int årgang, double kampHonorar){
        Profspiller profspiller = new Profspiller(navn, årgang, kampHonorar);
        return profspiller;
    }

    public static void tilknytDeltagelseTilKamp(Kamp kamp, Deltagelse deltagelse){
        kamp.getDeltagelser().add(deltagelse);
    }

    public static void createSomeObjects(){
       Spiller s1 = opretSpiller("Jane Jensen", 1999);
       Spiller s2 = opretSpiller("Lene Hansen", 2000);
       Spiller s3 = opretSpiller("Mette Petersen", 1999);

        Profspiller ps1 = opretProfspiller("Sofia Kjeldsen", 1999,50);
        Profspiller ps2 = opretProfspiller("Maria Nielsen", 2000,55);

       Kamp k1 = opretKamp("Herning", LocalDate.of(2015,1,26), LocalTime.of(10,30));
       Kamp k2 =opretKamp("Ikast", LocalDate.of(2015,1,27), LocalTime.of(13,30));

        Deltagelse d1 = opretDeltagelse(false, "", s1);
        tilknytDeltagelseTilKamp(k1,d1);
        tilknytDeltagelseTilKamp(k2,d1);

        Deltagelse d2 = opretDeltagelse(false, "", s2);
        tilknytDeltagelseTilKamp(k1,d2);
        tilknytDeltagelseTilKamp(k2,d2);

        Deltagelse d3 = opretDeltagelse(false, "", s3);
        tilknytDeltagelseTilKamp(k1,d3);
        tilknytDeltagelseTilKamp(k2,d3);

        Deltagelse d4 = opretDeltagelse(false, "", ps1);
        tilknytDeltagelseTilKamp(k1,d4);
        tilknytDeltagelseTilKamp(k2,d4);

        Deltagelse d5 = opretDeltagelse(false, "", ps2);
        tilknytDeltagelseTilKamp(k1,d5);
        tilknytDeltagelseTilKamp(k2,d5);

        k1.afbud(s1,d1);
        // SET BEGRUNDELSE OPG 7 
    }
}
