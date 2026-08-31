
import java.util.Scanner;

public class P09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = scan.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }

        int ans = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (ar[i] == ar[j]) {
                    count++;
                }
            }
            if (count == 1) {
                ans = ar[i];
                break;
            }
        }

        System.out.println(ans);
    }
}
