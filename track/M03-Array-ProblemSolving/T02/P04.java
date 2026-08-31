
import java.util.Scanner;

public class P04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = scan.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i <= ar.length - 1; i++) {
            ar[i] = scan.nextInt();
        }
        int firstLargest = ar[0];
        int secondLargest = -1;
        for (int i = 1; i < n; i++) {
            if (ar[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = ar[i];
            } else if (ar[i] > secondLargest && ar[i] != firstLargest) {
                secondLargest = ar[i];
            }
        }
        if (secondLargest == -1) {
            System.out.println("No second largest distinct value");
        } else {
            System.out.println(secondLargest);
        }
    }
}
