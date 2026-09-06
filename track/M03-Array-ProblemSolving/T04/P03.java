
import java.util.Scanner;

public class P03 {

    static void reverse(int[] numbers, int left, int right) {
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }
        System.out.println("Enter the left index:");
        int left = scan.nextInt();
        System.out.println("Enter the right index:");
        int right = scan.nextInt();
        int k = scan.nextInt();

        // Validate range: 0 <= left <= right < n
        if (left < 0 || left > right || right >= n) {
            System.out.println("-1");
            scan.close();
            return;
        }

        int len = right - left + 1;
        k = k % len;

        // In-place rotation using 3 reverses
        reverse(numbers, left, right);
        reverse(numbers, left, left + k - 1);
        reverse(numbers, left + k, right);

        // Print without an extra trailing space
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        scan.close();
    }
}
