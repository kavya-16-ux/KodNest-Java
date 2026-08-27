
import java.util.Scanner;

public class P06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] ar = new int[n];
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
            if (ar[i] > 0) {
                positiveCount++;
            } else if (ar[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Print once after the loop finishes
        System.out.print(positiveCount + " " + negativeCount + " " + zeroCount);

        scanner.close();
    }
}
