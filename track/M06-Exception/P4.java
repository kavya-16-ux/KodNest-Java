
import java.util.Scanner;

class P4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = sc.nextInt();
        // Write try and catch ArithmeticException.
        try {
            int average = total / count;
            System.out.println("Average: " + average);
        } catch (Exception e) {
            System.out.println("Cannot calculate average");
        }
    }
}
