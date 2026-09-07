
import java.util.Scanner;

public class P09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }

        int duplicate = -1;
        int missing = -1;

        // Check every number from 1 to n by counting its occurrences in ar
        for (int i = 1; i <= n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (ar[j] == i) {
                    count++;
                }
            }

            // Compare the count
            if (count == 2) {
                duplicate = i;
            } else if (count == 0) {
                missing = i;
            }
        }

        System.out.println(duplicate + " " + missing);
    }
}
