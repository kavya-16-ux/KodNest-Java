
import java.util.Scanner;

public class P03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = scanner.nextInt();
        int[] ar = new int[n];
        int sort = 1;
        System.out.println("Enter the array elemnets:");
        for (int i = 0; i <= ar.length - 1; i++) {
            ar[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 1; i++) { // compare till the last 2 value
            //if i take n last and no other value thta why n-1
            if (ar[i] > ar[i + 1]) {
                sort = 0;
                break;
            }
        }
        System.out.println(sort);

    }
}
