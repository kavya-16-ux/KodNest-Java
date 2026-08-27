
import java.util.Scanner;

public class P04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read the first element to initialize min and max
        arr[0] = scanner.nextInt();
        int minimum = arr[0];
        int maximum = arr[0];

        // Read the rest of the elements
        for (int i = 1; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }

        System.out.println(minimum + " " + maximum);

        scanner.close();
    }
}
