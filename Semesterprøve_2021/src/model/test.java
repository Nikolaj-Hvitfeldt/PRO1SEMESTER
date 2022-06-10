package model;

import controller.Controller;

public class test {

    public static void main(String[] args) {

        Studerende studerende = new Studerende("Pik", "Fjæs");

        Deltagelse deltagelse = new Deltagelse(studerende);

        System.out.println(deltagelse.isRegistreret());
        deltagelse.setRegistreret(true);
        deltagelse.setStatus(DeltagerStatus.FRAVÆR);
        System.out.println(deltagelse.erRegistreretFraværende());

        Controller.initStorage();

    }
}
