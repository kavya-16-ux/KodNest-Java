
import java.util.Scanner;

public class Prg3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array:");
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Arrays are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
