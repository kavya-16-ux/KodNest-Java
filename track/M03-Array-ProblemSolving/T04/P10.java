
import java.util.Scanner;

public class P10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        long[] ar = new long[n];
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextLong();
            totalSum += ar[i];
        }

        long leftSum = 0;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            long rightSum = totalSum - leftSum - ar[i];

            if (leftSum == rightSum) {
                ans = i;
                break; // Found the first equilibrium index
            }

            leftSum += ar[i];
        }

        System.out.println(ans);
        scan.close();
    }
}
