
import java.util.Scanner;

public class Prg2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter the array size");
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            if (a[i] % 2 == 0) {
                i++;
            } else if (a[i] % 2 != 0 && a[j] % 2 == 0) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
                j--;
            } else {
                j--;
            }
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
