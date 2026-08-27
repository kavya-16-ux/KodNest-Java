
import java.util.Scanner;

public class P08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n = scan.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }
        System.out.println("Enter the size of second array");
        int m = scan.nextInt();
        int[] arr = new int[m];
        System.out.println("Enter the array elements");
        for (int i = 0; i < m; i++) {
            arr[i] = scan.nextInt();
        }

        if (n != m) {
            System.out.println(0);
        } else {
            boolean isIdentical = true;
            for (int i = 0; i < n; i++) {
                if (ar[i] != arr[i]) {
                    isIdentical = false;
                    break;
                }
            }
            if (isIdentical == true) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        scan.close();
    }
}
