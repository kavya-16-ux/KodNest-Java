
import java.util.Scanner;

public class P13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        long[] ar = new long[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextLong();
        }

        // Kadane's Algorithm
        long currentSum = ar[0];
        long maxSum = ar[0];

        for (int i = 1; i < n; i++) {
            // Choose between starting a new subarray or extending the previous one
            currentSum = Math.max(ar[i], currentSum + ar[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
        scan.close();
    }
}
