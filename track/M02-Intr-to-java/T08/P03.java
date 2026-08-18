
import java.util.Scanner;

public class P03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] ar = new int[size];

        // 1. Read input first
        for (int i = 0; i <= ar.length - 1; i++) {
            ar[i] = scan.nextInt();
        }

        // 2. Set min and max AFTER taking input
        int minimum = ar[0];
        int maximum = ar[0];

        // 3. Find min and max
        for (int i = 0; i <= ar.length - 1; i++) {
            if (ar[i] > maximum) {
                maximum = ar[i];
            }
            if (ar[i] < minimum) {
                minimum = ar[i];
            }
        }

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }
}
