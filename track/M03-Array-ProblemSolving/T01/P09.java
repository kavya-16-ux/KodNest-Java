
import java.util.Scanner;

public class P09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <= ar.length - 1; i++) {
            ar[i] = scanner.nextInt();
        }
        int min = ar[0];
        int max = ar[0];
        for (int i = 0; i <= ar.length - 1; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        int diff = max - min;
        System.out.println(diff);

        scanner.close();
    }
}
