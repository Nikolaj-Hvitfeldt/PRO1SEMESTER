package ex_employees;

public class Employee {
    // The first name of the employee.
    private final String firstName;
    // The last name of the employee
    private final String lastName;
    // Whether the employee is a trainee or not.
    private boolean trainee;
    // Age of the Employee
    private int age;
    //  Happy birthday employee
    public void happyBirthday() {
        age = age + 1;
    }

    /**
     * Create an employee as a trainee with the given name.
     */
    public Employee(String name, String lastname, int age) {
        this.firstName = name;
        this.lastName = lastname;
        this.trainee = true;
        this.age = age;
    }

    /**
     * Return the name of the employee.
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * Return the trainee state of the employee.
     */
    public boolean isTrainee() {
        return trainee;
    }

    /**
     * Set the trainee state of the employee.
     */
    public void setTrainee(boolean trainee) {
        this.trainee = trainee;
    }

    /**
     * Return a description of the employee (for test purposes).
     */
    @Override
    public String toString() {
        return firstName + " (trainee: " + trainee + ")";
    }

    /**
     * Print a description of the employee.
     */
    public void printEmployee() {
        System.out.println("*******************");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Trainee: " + trainee);
        System.out.println("Age: " + age);
        System.out.println("*******************");
    }
//   Returns the age of the employee
    public int getAge() {
        return this.age;
    }
//   Sets the age of the employee
    public void setAge(int age) {
        this.age = age;
    }
}
