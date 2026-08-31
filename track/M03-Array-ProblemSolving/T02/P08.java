
import java.util.Scanner;

public class P08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = scan.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }

        int firstValue = ar[0];
        int secondValue = -1;

        for (int i = 1; i < n; i++) {
            if (ar[i] < firstValue) {
                secondValue = firstValue;
                firstValue = ar[i];
            } else if (ar[i] != firstValue) {
                if (secondValue == -1 || ar[i] < secondValue) {
                    secondValue = ar[i];
                }
            }
        }

        if (secondValue == -1) {
            System.out.println("No second smallest distinct value");
        } else {
            System.out.println(secondValue);
        }
    }
}
