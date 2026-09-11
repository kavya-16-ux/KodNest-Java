
import java.util.Scanner;

public class P07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // Create a builder, reverse it and display the result.
        StringBuilder s = new StringBuilder(text);
        System.out.println("Reversed: " + s.reverse());
    }
}
