
import java.util.Scanner;

public class P09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = scan.nextInt();
        System.out.println("Enter the number of columns");
        int c = scan.nextInt();
        int[][] a = new int[r][c];
        int count = 0;
        System.out.println("Enter the array elements");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                a[i][j] = scan.nextInt();
                if (a[i][j] == 0) {
                    count++;
                }
            }
        }

        System.out.println("Available seats: " + count);
    }
}
