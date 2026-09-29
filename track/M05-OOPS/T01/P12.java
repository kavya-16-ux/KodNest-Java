
import java.util.Scanner;

class BankAccount {

    private double balance;

    BankAccount(double balance) {
        // Store opening balance
        this.balance = balance;

    }

    public void withdraw(double amount) {
        // Perform a valid withdrawal
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        // Return balance
        return balance;
    }
}

public class P12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        double balance = scanner.nextDouble();
        double amount = scanner.nextDouble();
        BankAccount b = new BankAccount(balance);
        b.withdraw(amount);
        System.out.println(b.getBalance());

    }
}
