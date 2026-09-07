
import java.util.Scanner;

public class P11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        long[] ar = new long[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextLong();
        }

        int k = scan.nextInt();

        // Sum of the first window
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += ar[i];
        }

        long minSum = sum;

        // Slide window and find minimum sum
        for (int i = k; i < n; i++) {
            sum += ar[i] - ar[i - k];
            if (sum < minSum) {
                minSum = sum;
            }
        }

        System.out.println(minSum);
        scan.close();
    }
}
