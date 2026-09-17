
import java.util.Scanner;

class NumberUtility {

    static int larger(int first, int second) {
        // Return the larger value.
        int largerNumber = Math.max(first, second);
        return largerNumber;
    }
}

public class P11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers and call NumberUtility.larger().
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println("Larger: " + NumberUtility.larger(first, second));
    }
}
