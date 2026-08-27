
import java.util.Scanner;

public class P05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int position = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == target) {
                position = i;
                break;
            } else {
                position = -1;
            }
        }
        System.out.println(position);
        scanner.close();
    }
}
