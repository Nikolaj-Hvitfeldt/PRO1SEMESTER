package bank_account_spec;

public class BankAccountApp {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(2000);
        BankAccount b2 = new BankAccount(5000);
        BankAccount b3 = new BankAccount(2500.22);

        b1.printBankAccount();
        System.out.println();
        b2.printBankAccount();
        System.out.println();
        b3.printBankAccount();
    }
}
