package ex_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        String[] str = {"Putin", "Stalin","Lenin","Mao","Mussolini"};

        System.out.println(Arrays.toString(str));


        System.out.println(Arrays.toString(selectSortArray(str)));
        System.out.println();

        ArrayList<Customer> customers = new ArrayList<>(List.of(
                new Customer( "Vladimir", "Stalin", 10),
                new Customer( "Mogens", "Mogensen", 15),
                new Customer( "Vladimir", "Putin", 17),
                new Customer( "Random", "Navn", 25),
                new Customer( "Befri", "Mig", 20)));

        System.out.println(customers);
        System.out.println(selectSortCustomer(customers));
    }

    public static String [] selectSortArray(String[] unsorted){
        for (int i = 0; i < unsorted.length - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[j].compareTo(unsorted[indexOfMin]) < 0) {
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i) {
                String temp = unsorted[i];
                unsorted[i] = unsorted[indexOfMin];
                unsorted[indexOfMin] = temp;
            }
        } return unsorted;
    }

    public static ArrayList<Customer> selectSortCustomer(ArrayList<Customer> unsorted){
        for (int i = 0; i < unsorted.size() - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < unsorted.size(); j++) {
                if (unsorted.get(j).compareTo(unsorted.get(indexOfMin)) < 0) {
                    indexOfMin = j;
                }
            }
            if (indexOfMin != i) {
                unsorted.set(i, unsorted.set(indexOfMin, unsorted.get(i)));
            }
        }
        return unsorted;
    }
}

