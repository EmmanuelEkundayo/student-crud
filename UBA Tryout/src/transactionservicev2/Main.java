package transactionservicev2;
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //welcome the user
        System.err.println("WELCOME TO UBA TRANSACTION SERVICE");
        System.out.println("Whats your name?");

        // assign account number randomly
        int min = 00000000;
        int max = 99999999;
        int randomInt = (int)(Math.random() * (max - min + 1)) + min;

        //declaration of variables
        String name= input.nextLine();
        int account_number = randomInt;
        double account_balance = 0;
        String transactionId = UUID.randomUUID().toString();
//        Customer customer1 = new Customer(name[0], account_number[0]);
//        Customer customer2 = new Customer();
        //user picks what to do
            System.out.println(name + " you have been allocated a random 8 digit number which is " + account_number + " and your account balance is " + account_balance);
            System.out.println("what do you want to do today? " + name);
            System.out.println("select 1 to deposit, 2 to withdraw,3");
            int option = input.nextInt();

        //functions for customer actions
        switch (option){
            case 1:

            case 2:

            default: System.out.println("invalid option");
        }

    }
}
