
import java.util.Scanner;

public class P02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        long[] suffix = new long[a.length];
        suffix[n - 1] = a[n - 1];
        for (int i = a.length - 2; i > 0; i--) {
            suffix[i] = a[i] + suffix[i + 1];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Suffix sum: " + suffix[i]);
        }
    }
}
