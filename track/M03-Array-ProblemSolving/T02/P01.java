
import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = scanner.nextInt();
        int[] ar = new int[n];
        long sum = 0;
        System.out.println("Enter the array elements:");
        for (int i = 0; i <= ar.length - 1; i++) {
            ar[i] = scanner.nextInt();
            sum += ar[i];
        }
        double avg = (double) sum / n;
        int count = 0;
        for (int i : ar) {
            if (i > avg) {
                count++;
            }
        }
        System.out.println(count);

    }
}
