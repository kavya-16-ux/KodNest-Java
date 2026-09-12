
import java.util.Scanner;

public class P16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        // Reverse and display the word.
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        System.out.println("Reversed: " + sb);
    }
}
