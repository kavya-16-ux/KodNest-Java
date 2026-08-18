
import java.util.Scanner;

class Found {

    boolean found = false;

    void freq(int ar[], int target) {
        for (int i = 0; i <= ar.length - 1; i++) {
            if (ar[i] == target) {
                found = true;
                System.out.println("Found");
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }

    void reverse(int ar[]) {
        System.out.print("Reverse order: ");
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i] + " ");
        }
    }
}

public class P05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] ar = new int[size];
        for (int i = 0; i <= ar.length - 1; i++) {
            ar[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        Found f = new Found();
        f.freq(ar, target);
        f.reverse(ar);
    }
}
