
import java.util.Scanner;

public class P11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String learnerName = scanner.nextLine();

        // Build and display the greeting.
        StringBuilder sb = new StringBuilder();
        sb.append(learnerName + "!");
        System.out.println("Hello, " + sb);
    }
}
