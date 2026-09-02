
import java.util.Scanner;

public class P05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Before shifting");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int temp = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        // or you can use this for loop
        //for(int i =a.length-2;i>0;i++){
        // a[i + 1] = a[i];
        //}
        a[0] = temp;
        System.out.println("After shifting");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
