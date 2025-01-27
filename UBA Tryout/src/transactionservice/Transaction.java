package transactionservice;
public class Transaction {
    private String transactionId;
    private TransactionType type; // Use the enum here
    private double amount;
    private String accountNumber;
    private double previousBalance;
    private double newBalance;
    private String status;

    public Transaction(String transactionId, TransactionType type, double amount, String accountNumber,
                       double previousBalance, double newBalance, String status) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.previousBalance = previousBalance;
        this.newBalance = newBalance;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", type=" + type +
                ", amount=" + amount +
                ", accountNumber='" + accountNumber + '\'' +
                ", previousBalance=" + previousBalance +
                ", newBalance=" + newBalance +
                ", status='" + status + '\'' +
                '}';
    }
}
