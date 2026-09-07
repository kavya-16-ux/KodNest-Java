
import java.util.Scanner;

public class P06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }
        for (int i = 1; i < n; i++) {
            ar[i] += ar[i - 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }

    }
}
