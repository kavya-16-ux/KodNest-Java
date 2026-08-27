
import java.util.Scanner;

public class P07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        // 1. Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 2. Read range bounds
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();

        // 3. Count elements within [lower, upper]
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= lower && arr[i] <= upper) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
