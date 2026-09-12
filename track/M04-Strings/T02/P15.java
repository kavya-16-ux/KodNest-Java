
import java.util.Scanner;

public class P15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // Create the builder, convert it and display the String.
        StringBuilder sb = new StringBuilder(text);
        System.out.println("String: " + sb);
    }
}
