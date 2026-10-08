
import java.util.Scanner;

class Payment {

    public void pay(int amount) {
        System.out.println("Payment " + amount);
    }
}

class CardPayment extends Payment {

    // Override pay()
    @Override
    public void pay(int amount) {
        System.out.println("Card " + amount);
    }
}

class CashPayment extends Payment {

    // Override pay()
    @Override
    public void pay(int amount) {
        System.out.println("Cash " + amount);
    }
}

public class P07_parent_ref {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read choice and amount
        int choice = scanner.nextInt();
        int amount = scanner.nextInt();
        // Select the child object
        Payment p;
        // Call pay() through Payment reference
        switch (choice) {
            case 1:
                p = new CardPayment();
                p.pay(amount);
                break;
            case 2:
                p = new CashPayment();
                p.pay(amount);
                break;
            default:
                break;
        }
    }
}
