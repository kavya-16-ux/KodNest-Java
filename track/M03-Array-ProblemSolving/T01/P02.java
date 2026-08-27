
import java.util.Scanner;

public class P02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int n = scanner.nextInt();
        int[] arr = new int[n];
        long total = 0;
        double avg = 0.0;
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }
        avg = (double) total / n;
        System.out.println(total);
        System.out.printf("%.2f\n", avg);

        scanner.close();
    }
}
