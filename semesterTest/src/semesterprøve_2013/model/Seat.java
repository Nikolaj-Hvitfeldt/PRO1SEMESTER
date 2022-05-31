package semesterprøve_2013.model;

import java.util.ArrayList;

public class Seat {
    private int number;
    private Area area;

    // 0..* connection to Reservation;
    ArrayList<Reservation> reservations;

    public Seat(int number, Area area) {
        this.number = number;
        this.area = area;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
