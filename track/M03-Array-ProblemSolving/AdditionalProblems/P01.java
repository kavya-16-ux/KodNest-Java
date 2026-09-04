
import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size:");

        int n = scanner.nextInt();
        long[] numbers = new long[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLong();
        }

        // First find the minimum and maximum
        long minimum = numbers[0];
        long maximum = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        // Then classify every value using its two distances
        int minimumGroupCount = 0;
        int maximumGroupCount = 0;
        for (int i = 0; i < n; i++) {
            long distanceToMinimum = numbers[i] - minimum;
            long distanceToMaximum = maximum - numbers[i];

            if (distanceToMinimum < distanceToMaximum) {
                minimumGroupCount++;
            } else if (distanceToMaximum < distanceToMinimum) {
                maximumGroupCount++;
            }
        }

        // Print: minimumGroupCount maximumGroupCount
        System.out.print(minimumGroupCount + " " + maximumGroupCount);

        scanner.close();
    }
}
