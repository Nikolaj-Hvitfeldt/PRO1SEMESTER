package semesterprøve_2013.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reservation {
    private LocalDate start;
    private LocalDate end;
    Event event;

    // 0..* Connection to Seat
    ArrayList<Seat> seats;

    public Reservation(LocalDate start, LocalDate end, Event event) {
        this.start = start;
        this.end = end;
        this.event = event;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
    public ArrayList<Seat> getSeats() {
        return new ArrayList<>(seats);
    }
    public void addSeat(Seat seat){
        seats.add(seat);
    }
    public void removeSeat(Seat seat){
        seats.remove(seat);
    }
}
