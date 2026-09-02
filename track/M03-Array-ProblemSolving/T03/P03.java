
import java.util.Scanner;

public class P03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Enter the index that you want to remove the elements");
        int index = scan.nextInt();
        int[] b = new int[a.length - 1];
        for (int i = 0; i < a.length; i++) {
            if (i < index) {
                b[i] = a[i];
            } else {
                b[i] = a[i + 1];
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}
