
import java.util.Scanner;

public class P10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of produce:");
        int p = scan.nextInt();
        System.out.println("Enter the m number of money:");
        int m = scan.nextInt();

        int[][] a = new int[p][m];
        System.out.println("Enter the money of each money:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < a.length; i++) {
            int total = 0;

            for (int j = 0; j < a[i].length; j++) {
                total += a[i][j];
            }

            System.out.println("Product " + (i + 1) + " total: " + total);
        }
    }
}
