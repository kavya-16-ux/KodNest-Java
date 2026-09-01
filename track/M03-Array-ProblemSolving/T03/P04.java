
import java.util.Scanner;

public class P04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Before shifting");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = temp;
        System.out.println("After shifting");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
