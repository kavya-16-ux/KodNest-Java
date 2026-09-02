
import java.util.Scanner;

public class Prg5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sie of array");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (a[i] != a[j]) {
                System.out.print("0");
                return; // Not a palindrome, stop immediately
            }
            i++;
            j--;
        }

        // If loop completes without any mismatch, it is a palindrome
        System.out.print("1");
    }
}
