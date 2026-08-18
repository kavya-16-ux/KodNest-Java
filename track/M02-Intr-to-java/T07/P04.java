
import java.util.Scanner;

public class P04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println("The array elements are:");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i] + " ");
        }

        int sum = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            sum = sum + a[i];
        }
        System.out.println("Total: " + sum);
    }
}
