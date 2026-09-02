
import java.util.Scanner;

public class Prg4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Enter the k value");
        long kInput = scan.nextLong();
        int k = (int) (kInput % n);

        // 1. Reverse from 0 to k - 1
        int left = 0;
        int right = k - 1;
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }

        // 2. Reverse from k to n - 1
        left = k;
        right = n - 1;
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }

        // 3. Reverse from 0 to n - 1 (the whole array)
        left = 0;
        right = n - 1;
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }

        // Print the array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
