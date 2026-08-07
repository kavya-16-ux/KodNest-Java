
import java.util.Scanner;

public class P03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double monthlyIncome = scanner.nextDouble();
        double rentExpense = scanner.nextDouble();
        double foodExpense = scanner.nextDouble();
        double travelExpense = scanner.nextDouble();

        double total = rentExpense + foodExpense + travelExpense;
        double remaining = monthlyIncome - total;

        String res = remaining >= 0 ? "Within budget" : "Over budget";

        System.out.println("Total expense: " + total);
        System.out.println("Remaining: " + remaining);
        System.out.println("Status: " + res);

        scanner.close();
    }
}
