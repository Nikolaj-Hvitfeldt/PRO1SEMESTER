package semesterprøve_2013.model;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        Seat s1 = new Seat(1,Area.VIP);
        Seat s2 = new Seat(2,Area.VIP);
        Seat s3 = new Seat(3,Area.VIP);
        Seat s4 = new Seat(4,Area.VIP);
        Seat s5 = new Seat(5,Area.VIP);

        Event e1 = new Event("Putins Hævn",true);

        LocalDate e1Start = LocalDate.of(2022,6,10);
        LocalDate e1End = LocalDate.of(2022,6,22);

        Reservation r1 = new Reservation(e1Start,e1End,e1);

        r1.addSeat(s1);
        r1.addSeat(s2);
        r1.addSeat(s3);
        r1.addSeat(s4);
        r1.addSeat(s5);

//        e1.totalReservedSeats()

    }
}
