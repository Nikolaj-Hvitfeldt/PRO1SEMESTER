package gui;

import controller.Controller;
import model.Arrangement;
import model.Hold;
import model.Tutor;
import model.Uddannelse;

import java.time.LocalDate;
import java.time.LocalTime;

import static controller.Controller.tilføjArrangementTilTutor;

public class test {

    public static void main(String[] args) {

        Uddannelse u1 = Controller.opretUddannelse("DMU");
        Uddannelse u2 = Controller.opretUddannelse("FINØ");

        Hold h1 = Controller.opretHold("1dmE17S", "Margrethe Dybdahl");
        Hold h2 = Controller.opretHold("1dmE17T", "Kristian Dorland");
        Hold h3 = Controller.opretHold("1dmE17U", "Kell Ørhøj");
        Hold h4 = Controller.opretHold("1fiE17B", "Karen Jensen");

        Controller.tilføjHoldTilUddannelse(h1, u1);
        Controller.tilføjHoldTilUddannelse(h2, u1);
        Controller.tilføjHoldTilUddannelse(h3, u1);
        Controller.tilføjHoldTilUddannelse(h4, u2);

        Tutor t1 = Controller.opretTutor("Ander Hansen", "aaa@students.eaaa.dk", null);
        Tutor t2 = Controller.opretTutor("Peter Jensen", "ppp@students.eaaa.dk", null);
        Tutor t3 = Controller.opretTutor("Niels Madsen", "nnn@students.eaaa.dk", null);
        Tutor t4 = Controller.opretTutor("Lone Andersen", "lll@students.eaaa.dk", null);
        Tutor t5 = Controller.opretTutor("Mads Miller", "mmm@students.eaaa.dk", null);

        Arrangement a1 = Controller.opretArrangement("Rusfest", LocalDate.of(2017, 8, 31), LocalTime.of(18, 0), LocalTime.of(23, 30), 250);
        Arrangement a2 = Controller.opretArrangement("Fodbold", LocalDate.of(2017, 8, 30), LocalTime.of(14, 0), LocalTime.of(17, 30), 100);
        Arrangement a3 = Controller.opretArrangement("Brætspil", LocalDate.of(2017, 8, 29), LocalTime.of(12, 0), LocalTime.of(16, 30), 25);
        Arrangement a4 = Controller.opretArrangement("Mindeparken", LocalDate.of(2017, 8, 30), LocalTime.of(18, 0), LocalTime.of(22, 0), 25);

//        Controller.tilføjTutortilHold(t1,h1);
//        Controller.tilføjArrangementTilTutor(a1,t1);
//        t1.getArrangementer().add(a1);
//        System.out.println(t1.getArrangementer());
//        Controller.tilføjArrangementTilTutor(a2,t1);
//        System.out.println(t1.getArrangementer());


        System.out.println(t1.getArrangementer());

    }
}

