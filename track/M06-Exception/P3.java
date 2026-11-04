
import java.util.Scanner;

class P3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();
        // Put the division inside try.
        try {
            int answer = numerator / denominator;
            System.out.println("Result: " + answer);
        } // Catch ArithmeticException and print a friendly message.
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        // Print Finished after the try-catch.
        System.out.println("Finished");
    }
}
