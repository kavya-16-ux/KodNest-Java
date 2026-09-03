
import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        long[] prefix = new long[a.length];
        prefix[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            prefix[i] = a[i] + prefix[i - 1];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Prfix sum: " + prefix[i]);
        }
    }
}
