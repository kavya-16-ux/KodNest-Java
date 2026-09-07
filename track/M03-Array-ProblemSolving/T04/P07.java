
import java.util.Scanner;

public class P07 {

    static void rangeSum(int ar[], int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += ar[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // This line fixes both compiler errors:
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }

        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int left = scan.nextInt();
            int right = scan.nextInt();
            rangeSum(ar, left, right);
        }

        scan.close();
    }
}
