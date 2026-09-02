
import java.util.Scanner;

public class Prg6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int k = 0; k < a.length; k++) {
            a[k] = scan.nextInt();
        }

        int i = 0;
        int j = 1;

        while (j < a.length) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i += 2;
            j += 2;
        }

        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
