
import java.util.Scanner;

public class Prg5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String learnerName = scanner.nextLine();

        // Normalize and display the name.
        String normalize = learnerName.trim().toUpperCase();
        System.out.print("Normalized name: " + normalize);
    }
}
