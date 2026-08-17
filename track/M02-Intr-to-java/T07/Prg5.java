
import java.util.Scanner;

public class Prg5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array:");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Original array are:");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Reverse array are:");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
