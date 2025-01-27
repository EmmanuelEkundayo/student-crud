package transactionservice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.err.println("Welcome to UBA");
            System.out.println("1. Create Customer");
            System.out.println("2. Deposit");
            System.out.println("3. Transfer");
            System.out.println("4. Print Transactions");
            System.out.println("5. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    bank.createCustomer(name);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(accountNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter your account number: ");
                    String fromAccount = scanner.nextLine();
                    System.out.print("Enter recipient's account number: ");
                    String toAccount = scanner.nextLine();
                    System.out.print("Enter transfer amount: ");
                    double transferAmount = scanner.nextDouble();
                    bank.transfer(fromAccount, toAccount, transferAmount);
                    break;
                case 4:
                    bank.printTransactions();
                    break;
                case 5:
                    System.out.println("Logging out...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
