package ex_2;

import asso_group0m_0mperson.Group;
import asso_group0m_0mperson.Person;

import java.util.ArrayList;

public class Rental {
    private int no;
    private String date;
    private int days;
    private Car car;

    final ArrayList<Car> cars = new ArrayList<>(); // OBS: package visible

    ArrayList<Car> getCars() {
        return new ArrayList<>(cars);
    }

    public Rental(int no, String date, int days) {
        this.no = no;
        this.date = date;
        this.days = days;
    }

    public int getNo() {
        return no;
    }

    public String getDate() {
        return date;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    /** Pre: The car is not connected to this rental. */
    public void addCar(Car car) {
        cars.add(car);
        car.rentals.add(this);
    }
    /** Pre: The person is connected to this group. */
    public void removeCar(Car car) {
        cars.remove(car);
        car.rentals.remove(this);
    }

    public int getPrice(Car car) {
        int totalprice = car.getPricePerDay() * this.getDays();
        return totalprice;
    }
}
