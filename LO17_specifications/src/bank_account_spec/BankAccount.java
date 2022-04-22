package bank_account_spec;

public class BankAccount {

    private double balance;

    private int id;
    private static int currentId = 1001;


    /**
     * Constructs a bank account with a bank balance and an auto generated bank ID
     * pre: balance <= 0
     * @param balance
     */
    public BankAccount(double balance) {
        this.balance = balance;
        this.id = currentId;
        currentId++;
    }

    /**
     * Deposits an amount into the bank account balance
     * pre: amount > 0
     * @param amount
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraws an amount from the bank account balance
     * pre: amount < 0
     * @param amount
     */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /**
     * Returns the current amount on the bank account
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the ID of the chosen bank account object
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Prints the id and current amount of the bank account
     */
    public void printBankAccount (){
        System.out.println("Bank Account ID: " + id + "\n" + "Bank Balance: " + balance);
    }
}
