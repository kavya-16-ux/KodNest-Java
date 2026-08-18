
import java.util.Scanner;

class Found {

    int count = 0;

    void freq(int ar[], int key) {
        for (int i = 0; i <= ar.length - 1; i++) {
            if (ar[i] == key) {
                count++;
            }
        }
        System.out.print(key + " " + count);

    }
}

public class P04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scan.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i <= ar.length - 1; i++) {
            ar[i] = scan.nextInt();
        }
        System.out.println("The elements are:");
        for (int i = 0; i <= ar.length - 1; i++) {
            System.out.println(ar[i] + " ");
        }
        Found f = new Found();
        System.out.println("Enter the key to know how many times it repeat:");
        int key = scan.nextInt();
        f.freq(ar, key);

    }
}
