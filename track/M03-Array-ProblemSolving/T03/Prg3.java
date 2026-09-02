
import java.util.Scanner;

public class Prg3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Enter the start index");
        int lower_index = scan.nextInt();
        System.out.println("Enter the end index");
        int upper_index = scan.nextInt();

        // 1. Check for invalid boundaries according to the rules
        if (lower_index < 0 || upper_index >= n || lower_index > upper_index) {
            System.out.print("-1");
            return;
        }

        // 2. Reverse within bounds
        while (lower_index < upper_index) {
            int temp = a[lower_index];
            a[lower_index] = a[upper_index];
            a[upper_index] = temp;
            lower_index++;
            upper_index--;
        }

        // 3. Print the array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
