
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
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println("Enter the last elements of array b");
        b[b.length - 1] = scan.nextInt();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}
