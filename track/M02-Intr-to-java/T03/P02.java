
import java.util.Scanner;

public class P02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int days = scanner.nextInt();

        for (int i = 1; i <= days; i++) {
            int problemSolved = scanner.nextInt();
            total = problemSolved + total;
        }

        System.out.println("Total solved: " + total);

        if (total >= 20) {
            System.out.println("Status: Strong progress");
        } else if (total >= 10 && total <= 19) {
            System.out.println("Status: Keep improving");
        } else {
            System.out.println("Status: Needs more practice");
        }

        scanner.close();
    }
}
