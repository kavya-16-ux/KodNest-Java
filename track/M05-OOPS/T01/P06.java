
import java.util.Scanner;

class BankAccount {

    private double balance;

    BankAccount(double balance) {
        // Store opening balance
        this.balance = balance;
    }

    public void deposit(double amount) {
        // Add only a positive amount
        if (amount > 0) {
            balance += amount;
        }

    }

    public double getBalance() {
        // Return balance
        return balance;
    }
}

public class P06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read both values
        double balance = scanner.nextDouble();
        double amount = scanner.nextDouble();
        // Create account and deposit
        BankAccount a = new BankAccount(balance);
        a.deposit(amount);
        System.out.println(a.getBalance());
    }
}
