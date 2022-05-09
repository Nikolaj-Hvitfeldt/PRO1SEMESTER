package opg3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {


        ArrayList <Employee> employees = new ArrayList<>();

       WorkingBoy putin = new WorkingBoy("Putin","Kremlin", 60);
       Mechanic stalin = new Mechanic("Stalin","Kremlin","2020",100);
       employees.add(putin);
       employees.add(stalin);

       totalWeeklySalary(employees);



    }
    public static void totalWeeklySalary(ArrayList<Employee> employees){
        double sum = 0;
        for (Employee e : employees){
            System.out.println(e.getName() + " " + e.weeklySalary());
            sum += e.weeklySalary();
        }
        System.out.println("Total weekly payout " + sum);
    }
}
