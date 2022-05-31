package semesterprøve_2013.model;

import java.util.ArrayList;

public class Event {
    private String name;
    private boolean open;

    // 0..* connection Reservation
    ArrayList<Reservation> reservations;

    public Event(String name, boolean open) {
        this.name = name;
        this.open = open;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
    public ArrayList<Reservation> getReservations() {
        return new ArrayList<>(reservations);
    }
    public void addReservation(Reservation reservation){
        reservations.add(reservation);
    }
    public void removeReservation(Reservation reservation){
        reservations.remove(reservation);
    }

   public int totalReservedSeats(ArrayList<Reservation> reservations){
    int reservedSeats = 0;
    for (Reservation e : reservations) {
        reservedSeats += e.getSeats().size();
    }
    return reservedSeats;
    }
}
