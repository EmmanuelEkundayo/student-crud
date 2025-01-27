package transactionservicev2;
public class Customer {
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    private String name;
    private String accountNumber;
    private double balance;

    public Customer(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
}