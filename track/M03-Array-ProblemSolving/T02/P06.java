
import java.util.Scanner;

public class P06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = scan.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            if (ar[i] == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0; // resets the consecutive streak
            }
        }

        System.out.println(maxCount);
    }
}
