package ex_3;

import ex_2.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        String[] str = {"Putin", "Stalin","Lenin","Mao","Mussolini"};

        System.out.println(Arrays.toString(str));

        System.out.println();

        ArrayList<Customer> customers = new ArrayList<>(List.of(
                new Customer( "Vladimir", "Stalin", 10),
                new Customer( "Mogens", "Mogensen", 15),
                new Customer( "Vladimir", "Putin", 17),
                new Customer( "Random", "Navn", 25),
                new Customer( "Befri", "Mig", 20)));

        System.out.println(customers);

    }
}
