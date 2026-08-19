
import java.util.Scanner;

public class P07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row number:");
        int r = scan.nextInt();
        System.out.println("Enter the column number:");
        int c = scan.nextInt();
        int[][] a = new int[r][c];
        System.out.println("Enter the array elements:");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("The array elements:");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
