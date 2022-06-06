package opg3;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {

        ArrayList<Customer> goodCustomers = new ArrayList<>(List.of(
                new Customer("Jytte", "Hansen"), new Customer("Lasse", "Jensen"),
                new Customer("Anders", "Nielsen"), new Customer("Arne", "Andersen"),
                new Customer("Peter", "Petersen"), new Customer("Sascha", "Olsen"),
                new Customer("Søren", "Madsen")));

        Customer[] badCustomers = {
                new Customer("Anders", "Nielsen"), new Customer("Sisse", "Larsen"),
                new Customer("Peter", "Petersen"), new Customer("Lykke", "Li"),
                new Customer("Sandra", "Sandrasen"), new Customer("Charles", "Darwin")};

        System.out.println("Sorted Arraylist with good customers: ");
        Collections.sort(goodCustomers, Customer::compareTo);
        for (Customer e : goodCustomers) {
            System.out.println(e);
        }
        System.out.println();


        System.out.println("Sorted Arraylist with bad customers: ");
        Collections.sort(Arrays.asList(badCustomers), Customer::compareTo);
        for (Customer e : Arrays.asList(badCustomers)) {
            System.out.println(e);
        }
        System.out.println();

        System.out.println(goodCustomersFinal(goodCustomers,badCustomers));
    }

    public static ArrayList<Customer> goodCustomersFinal(ArrayList<Customer> l1, Customer[] l2) {
        ArrayList<Customer> result = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;

        while(i1 < l1.size() && i1 < l2.length){
            if(l1.get(i1).compareTo(l2[i2]) < 0) {
                result.add(l1.get(i1));
                i1++;
            }
            else if(l1.get(i1).compareTo(l2[i2]) > 0){
                i2++;}
            else {
                i1++;
                i2++;
            }
        }
        while(i1<l1.size()){
            result.add(l1.get(i1));
            i1++;
        }
        return result;
    }
}

