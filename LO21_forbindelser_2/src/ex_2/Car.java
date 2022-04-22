package ex_2;

import asso_group0m_0mperson.Person;

import java.util.ArrayList;

public class Car {
    private String no;
    private String year;
    private int pricePerDay;
    Rental rental;

    final ArrayList<Rental> rentals = new ArrayList<>();

    public ArrayList<Rental> getRentals() {
        return new ArrayList<>(rentals);
    }

    public Car(String no, String year, int pricePerDay) {
        this.no = no;
        this.year = year;
        this.pricePerDay = pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getNo() {
        return no;
    }

    public String getYear() {
        return year;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public int getLongestDate() {
        int longestDate = 0;
//        for (int i = 0; i < rentals.size(); i++)
        for (Rental rental : rentals){
            if (longestDate < rental.getDays()) {
                longestDate = rental.getDays();
            }
            return longestDate;
        }
        return longestDate;
    }
}
