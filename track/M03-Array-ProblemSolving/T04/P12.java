
import java.util.Scanner;

public class P12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        long[] ar = new long[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextLong();
        }

        long target = scan.nextLong();

        int left = 0;
        long currentSum = 0;
        int start = -1;
        int end = -1;

        // Two-pointer / variable sliding window
        for (int right = 0; right < n; right++) {
            currentSum += ar[right];

            // Shrink window from the left while the sum exceeds target
            while (currentSum > target && left < right) {
                currentSum -= ar[left];
                left++;
            }

            // Check if match found
            if (currentSum == target) {
                start = left;
                end = right;
                break; // Stop at the first non-empty matching window
            }
        }

        if (start != -1) {
            System.out.println(start + " " + end);
        } else {
            System.out.println("-1");
        }

        scan.close();
    }
}
