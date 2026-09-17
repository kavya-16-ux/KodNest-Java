
import java.util.Scanner;

class Calculator {

    static int add(int first, int second) {
        // Return the sum.
        int sum = first + second;
        return sum;
    }
}

public class P02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers and call Calculator.add().
        System.out.println("Enter the first number");
        int first = scanner.nextInt();
        System.out.println("Enter the second number");
        int second = scanner.nextInt();
        System.out.println("Sum: " + Calculator.add(first, second));
    }
}
