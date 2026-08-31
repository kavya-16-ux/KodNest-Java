
import java.util.Scanner;

public class P05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = scan.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }
        System.out.println("Enter the target element:");
        int target = scan.nextInt();
        // Assume the first element is the closest
        int ans = ar[0];
        int minDiff = ar[0] - target;
        if (minDiff < 0) {
            minDiff = -minDiff; // make it positive without using Math.abs
        }

        // Compare with the rest of the elements
        for (int i = 1; i < n; i++) {
            int currentDiff = ar[i] - target;
            if (currentDiff < 0) {
                currentDiff = -currentDiff; // make it positive
            }

            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                ans = ar[i];
            } else if (currentDiff == minDiff && ar[i] < ans) {
                ans = ar[i]; // if distance is same, pick the smaller value
            }
        }

        System.out.println(ans);
    }
}
