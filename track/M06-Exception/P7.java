
import java.util.Scanner;

class P7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        int divisor = sc.nextInt();
        int[] values = {10, 20, 30};

        try {
            int selected = values[index];
            System.out.println("Result: " + (selected / divisor));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Finished");

        sc.close();
    }
}
