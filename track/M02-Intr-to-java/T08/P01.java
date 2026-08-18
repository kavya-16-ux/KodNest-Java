
import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = scan.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i <= ar.length - 1; i++) {
            ar[i] = scan.nextInt();
        }
        System.out.println("The array elements are:");
        for (int i = 0; i <= ar.length - 1; i++) {
            System.out.println(ar[i] + " ");
        }
        int max = ar[0];
        for (int i = 0; i <= ar.length - 1; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        System.out.println("Max element: " + max);

    }
}
