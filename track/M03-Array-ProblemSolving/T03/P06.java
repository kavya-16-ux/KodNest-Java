
import java.util.Scanner;

public class P06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = scan.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i <= ar.length - 1; i++) {
            ar[i] = scan.nextInt();
        }
        System.out.println("Before swap:");
        for (int i : ar) {
            System.out.println(i);
        }
        int left = 0;
        int right = ar.length - 1;
        while (left < right) {
            int temp = ar[left];
            ar[left] = ar[right];
            ar[right] = temp;
            left++;
            right--;
        }
        System.out.println("After swap:");
        for (int i : ar) {
            System.out.println(i);
        }
    }
}
