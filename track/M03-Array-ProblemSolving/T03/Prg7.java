
import java.util.Scanner;

public class Prg7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            if (a[i] < 0) {
                i++;
            } else if (a[j] > 0) {
                j--;
            } else {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
