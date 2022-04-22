package gui;

import controller.Controller;
import javafx.application.Application;
import model.Company;
import model.Customer;
import model.Employee;

public class ArchitectureApp {

    public static void main(String[] args) {
        initStorage();
        Application.launch(ArchitectureGui.class);
    }

    public static void initStorage() {
        Company ibm = Controller.createCompany("IBM", 37);
        Company amd = Controller.createCompany("AMD", 40);
        Company sled = Controller.createCompany("SLED", 45);
        Controller.createCompany("Vector", 32);

        Employee bob = Controller.createEmployee("Bob Dole", 210, 2022);
        Controller.addEmployeeToCompany(bob, ibm);

        Employee alice = Controller.createEmployee("Alice Schmidt", 250, 2010);
        Controller.addEmployeeToCompany(alice, ibm);

        Employee george = Controller.createEmployee("George Down", 150,2005);
        Controller.addEmployeeToCompany(george, amd);

        Employee rita = Controller.createEmployee("Rita Uphill", 300,2021);
        Controller.addEmployeeToCompany(rita, sled);

        Controller.createEmployee("John Doe", 100,3001);


        Customer putin = Controller.createCustomer("Putin");
        Controller.addCustomerToCompany(putin,ibm);

        Customer stalin = Controller.createCustomer("Stalin");
        Controller.addCustomerToCompany(stalin,ibm);

        Customer kimjongun = Controller.createCustomer("Kim Jong Un");
        Controller.addCustomerToCompany(kimjongun, sled);

        Customer mao = Controller.createCustomer("Mao");
        Controller.addCustomerToCompany(mao,amd);

    }
}
