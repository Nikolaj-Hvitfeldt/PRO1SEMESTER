package ex_2;

import java.time.LocalDate;
import java.time.Period;

public class Rental {

    private int number;
    private static Period days;
    private LocalDate startDate;
    private double price;

    public Rental(int number, Period days, LocalDate startDate, double price) {
        this.number = number;
        this.days = days;
        this.startDate = startDate;
        this.price = price;

    }

    /**
     * returns the price for one day of rental
     * @return price
     */
    public double getPricePrDay() {
        return price;
    }

    /**
     * Returns the number of days of rental
     * @return days
     */
    public Period getDays() {
        return days;
    }

    /**
     * Sets the number of days of rental
     * @param days
     */
    public void setDays(Period days) {
        this.days = days;
    }

    /**
     * returns the start date of rental
     * @return startDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * returns the total price of rental
     * @return totalPrice
     */
    public double getTotalPrice() {
        double PricePrDay = price;
        String totalDays = getDays().toString();
        double totalPrice = PricePrDay * Integer.parseInt(totalDays);
        return totalPrice;
    }

    public void printRental(){
        System.out.println("Total Price: " + getTotalPrice() + "End date: ");
    }
}
