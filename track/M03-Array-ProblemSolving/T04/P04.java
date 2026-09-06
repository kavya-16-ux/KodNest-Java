
import java.util.Scanner;

public class P04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = scanner.nextInt();

        // 1. Find the first and last occurrence of target
        int first = -1;
        int last = -1;

        for (int i = 0; i < n; i++) {
            if (numbers[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        // 2. If target does not occur, print -1
        if (first == -1) {
            System.out.println("-1");
            scanner.close();
            return;
        }

        // 3. Reverse the subarray between first and last index
        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }

        // 4. Print the array without trailing space
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
