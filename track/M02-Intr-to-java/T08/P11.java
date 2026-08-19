
import java.util.Scanner;

public class P11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = scan.nextInt();

        int[] a = new int[n];
        int total = 0;
        System.out.println("Enter the array elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
            total += a[i];
        }

        System.out.println("Array total: " + total);

        int r = scan.nextInt();
        int c = scan.nextInt();

        int[][] ar = new int[r][c];
        int totalMatrix = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = scan.nextInt();
                totalMatrix += ar[i][j];
            }
        }

        System.out.println("Matrix total: " + totalMatrix);
    }
}
