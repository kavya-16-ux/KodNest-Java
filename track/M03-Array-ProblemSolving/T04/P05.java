
import java.util.Scanner;

public class P05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // 1. Calculate expected sum from 1 to n using formula: n * (n + 1) / 2
        int expectedSum = (n * (n + 1)) / 2;

        // 2. Calculate actual sum of the given (n - 1) numbers
        int actualSum = 0;
        for (int i = 0; i < n - 1; i++) {
            actualSum += scanner.nextInt();
        }

        // 3. The missing number is the difference
        int missingNumber = expectedSum - actualSum;

        System.out.println(missingNumber);

        scanner.close();
    }
}
