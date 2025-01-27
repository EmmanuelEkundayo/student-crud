package transactionservice;
import java.util.*;

class Bank {
    private Map<String, Customer> customers = new HashMap<>();
    private List<Transaction> transactions = new ArrayList<>();
    private static int accountCounter = 1000;

    public String createCustomer(String name) {
        String accountNumber = "ACC" + accountCounter++;
        Customer customer = new Customer(name, accountNumber);
        customers.put(accountNumber, customer);
        System.out.println("Customer created successfully! Account Number: " + accountNumber);
        return accountNumber;
    }

    public boolean deposit(String accountNumber, double amount) {
        Customer customer = customers.get(accountNumber);
        if (customer != null && amount > 0) {
            double previousBalance = customer.getBalance();
            customer.deposit(amount);
            recordTransaction(TransactionType.DEPOSIT, amount, accountNumber, previousBalance, customer.getBalance(), "Successful");
            System.out.println("Deposit successful. New Balance: " + customer.getBalance());
            return true;
        }
        recordTransaction(TransactionType.DEPOSIT, amount, accountNumber, 0, 0, "Failed");
        System.out.println("Deposit failed.");
        return false;
    }


    public boolean transfer(String fromAccount, String toAccount, double amount) {
        Customer sender = customers.get(fromAccount);
        Customer receiver = customers.get(toAccount);
        if (sender != null && receiver != null && amount > 0 && sender.withdraw(amount)) {
            double senderPreviousBalance = sender.getBalance() + amount;
            double receiverPreviousBalance = receiver.getBalance();
            receiver.deposit(amount);
            recordTransaction(TransactionType.TRANSFER, amount, fromAccount, senderPreviousBalance, sender.getBalance(), "Successful");
            recordTransaction(TransactionType.TRANSFER, amount, toAccount, receiverPreviousBalance, receiver.getBalance(), "Successful");
            System.out.println("Transfer successful.");
            return true;
        }
        recordTransaction(TransactionType.TRANSFER, amount, fromAccount, 0, 0, "Failed");
        System.out.println("Transfer failed.");
        return false;
    }
    public boolean withdraw(String accountNumber, double amount) {
        Customer customer = customers.get(accountNumber);
        if (customer != null && amount > 0 && customer.withdraw(amount)) {
            double previousBalance = customer.getBalance() + amount;
            recordTransaction(TransactionType.WITHDRAW, amount, accountNumber, previousBalance, customer.getBalance(), "Successful");
            System.out.println("Withdrawal successful. New Balance: " + customer.getBalance());
            return true;
        }
        recordTransaction(TransactionType.WITHDRAW, amount, accountNumber, 0, 0, "Failed");
        System.out.println("Withdrawal failed.");
        return false;
    }


    public void recordTransaction(TransactionType type, double amount, String accountNumber,
                                  double previousBalance, double newBalance, String status) {
        String transactionId = UUID.randomUUID().toString();
        Transaction transaction = new Transaction(transactionId, type, amount, accountNumber, previousBalance, newBalance, status);
        transactions.add(transaction);
    }


    public void printTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
