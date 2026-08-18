
import java.util.Scanner;

public class P06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scan.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter the array elements:");

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        System.out.println("Enter the target elements:");
        int target = scan.nextInt();
        int count = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == target) {
                count++;
            }
        }

        System.out.println("Frequency of " + target + ": " + count);

        scan.close();
    }
}
