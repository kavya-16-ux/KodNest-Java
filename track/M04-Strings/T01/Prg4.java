
import java.util.Scanner;

public class Prg4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expectedText = scanner.nextLine();
        String enteredText = scanner.nextLine();

        // Compare and display the result.
        System.out.print("Match: " + expectedText.equals(enteredText));
    }
}
