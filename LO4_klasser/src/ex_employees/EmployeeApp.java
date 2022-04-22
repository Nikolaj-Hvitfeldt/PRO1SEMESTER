package ex_employees;

public class EmployeeApp {

    public static void main(String[] args) {
        Employee e1 = new Employee("Hans", "Jensen",20);
        System.out.println("First name: " + e1.getFirstName());
        System.out.println("Last name: " + e1.getLastName());
        System.out.println("Trainee? " + e1.isTrainee());
        System.out.println("Age: " + e1.getAge());
        System.out.println();

        e1.setTrainee(false);
        e1.printEmployee();
        System.out.println();

        Employee e2 = new Employee("Kæmpe","Makker", 0);
        e2.setAge(22);
        e2.setTrainee(true);
        System.out.println("*******************");
        System.out.println("First name: " + e2.getFirstName());
        System.out.println("Last name: " + e2.getLastName());
        System.out.println("Trainee: " + e2.isTrainee());
        System.out.println("Age: " + e2.getAge());
        System.out.println("*******************");
        System.out.println();

        e2.happyBirthday();
        e2.printEmployee();

        Employee e3 = new Employee("Ann","Rittig", 26);
        e3.printEmployee();
    }
}
