
import java.util.Scanner;

public class Prg7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();

        // Create a lowercase copy and display both values.
        System.out.println("Original: " + original);
        String res = original.toLowerCase();
        System.out.println("Lowercase copy: " + res);
    }
}
