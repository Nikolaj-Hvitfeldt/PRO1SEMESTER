package ex_person;

public class Person {
    // The name of the person
    private final String name;
    // The address of the person
    private String address;
    // The monthly salary of the person
    private int monthlySalary;

    public Person(String name, String address, int monthlySalary) {
        this.name = name;
        this.address = address;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void getAddress(String address) {
        this.address = address;
    }

    public int getMonthlySalary() {
        return this.monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    // Print description of the person
    public void printPerson() {
        System.out.println("*********************");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Monthly Salary " + monthlySalary);
        System.out.println("*********************");
    }

    public double yearlySalary() {
        return monthlySalary * 12*1.025;
    }
}