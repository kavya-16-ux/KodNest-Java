
import java.util.Scanner;

class Account {

    private int accountNumber;

    Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends Account {

    SavingsAccount(int accountNumber) {
        // Add the required parent-constructor call
        super(accountNumber);
    }
}

public class P19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read, create and print
        int num = scanner.nextInt();
        SavingsAccount a = new SavingsAccount(num);
        System.out.println(a.getAccountNumber());
    }
}
