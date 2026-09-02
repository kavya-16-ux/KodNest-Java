
import java.util.Scanner;

public class Prg1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] != 0) {
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");

        }

    }
}
