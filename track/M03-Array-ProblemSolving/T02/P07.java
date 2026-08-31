
import java.util.Scanner;

public class P07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = scan.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }
        int currentLength = 1;
        int maxLength = 1;

        // Start from i = 1 to prevent ar[i - 1] from hitting index -1
        for (int i = 1; i < n; i++) {
            if (ar[i] > ar[i - 1]) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                currentLength = 1;
            }
        }

        System.out.println(maxLength);
    }
}
