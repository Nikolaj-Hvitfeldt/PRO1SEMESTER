package opg1;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Customer putin = new Customer("Vladimir","Putin");
        Customer lenin = new Customer("Vladimir","Lenin");
        Customer stalin = new Customer("Joseph","Stalin");
        Customer mao = new Customer("Mao","Zedong");
        Customer mussolini= new Customer("Benito","Mussolini");
        Customer kimJong = new Customer("Kim-Jong","Un");
        Customer hitler = new Customer("Adolf","Hitler");

        ArrayList<Customer> customers1 = new ArrayList<Customer>();
        customers1.add(putin);
        customers1.add(lenin);
        customers1.add(stalin);

        ArrayList<Customer> customers2 = new ArrayList<Customer>();
        customers2.add(mao);
        customers2.add(mussolini);
        customers2.add(kimJong);
        customers2.add(hitler);

        System.out.println(mergeAllCustomers(customers1,customers2));

    }
    /**
     * Return a sorted list containing all customers
     * from the lists l1 and l2.
     * Pre: l1 and l2 are sorted.
     */
    public static ArrayList<Customer> mergeAllCustomers(ArrayList<Customer> s1, ArrayList<Customer> s2) {
        ArrayList<Customer> result = new ArrayList<Customer>();

        // flet sålænge der er noget i begge lister
        int i1 = 0;
        int i2 = 0;
        while (i1 < s1.size() && i2 < s2.size()) {
            if (s1.get(i1).compareTo(s2.get(i2)) < 0) {
                // s1's tal er mindst
                result.add(s1.get(i1));
                i1++;
            } else {
                // s2's tal er mindst
                result.add(s2.get(i2));
                i2++;
            }
        }
        // tøm den liste der ikke er tom
        while (i1 < s1.size()) {
            result.add(s1.get(i1));
            i1++;
        }
        while (i2 < s2.size()) {
            result.add(s2.get(i2));
            i2++;
        }
        return result;
    }
}

