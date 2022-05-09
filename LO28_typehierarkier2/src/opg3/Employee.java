package opg3;

public abstract class Employee {

    private String name;
    private String address;
    private int hourlyWage;

    public Employee(String name, String address, int hourlyWage) {
        this.name = name;
        this.address = address;
        this.hourlyWage = hourlyWage;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double weeklySalary() {
        int total = getHourlyWage() * 37;
        return total;
    }
}
