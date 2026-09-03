
import java.util.Arrays;
import java.util.Scanner;

public class Prg9 {

    static void reverse(int ar[], int left, int right) {
        while (left < right) {
            int temp = ar[left];
            ar[left] = ar[right];
            ar[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }
        System.out.println("Enter the k avlue in which how many times you want to rotate");
        int k = scan.nextInt();

        reverse(ar, 0, k - 1);
        System.out.println("First rotate:" + Arrays.toString(ar));
        reverse(ar, k, n - 1);
        System.out.println("Second rotate:" + Arrays.toString(ar));
        reverse(ar, 0, n - 1);
        System.out.println("Last rotate:" + Arrays.toString(ar));

    }
}
