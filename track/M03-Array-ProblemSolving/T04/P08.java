
import java.util.Scanner;

public class P08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += ar[i];
        }
        int maxSum = sum;

        // Slide the window from left to right
        for (int i = k; i < n; i++) {
            sum += ar[i] - ar[i - k]; // add incoming element, remove outgoing element
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }
}
