package opg1;

public class Customer implements Comparable<Customer> {

    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Customer o) {
        if(this.lastName.compareTo(o.lastName) !=0)
        return this.lastName.compareTo(o.lastName);
        else return this.firstName.compareTo(o.firstName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
