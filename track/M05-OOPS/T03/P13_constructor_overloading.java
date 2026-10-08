
import java.util.Scanner;

class Display {

    // Create show(int)
    Display(int value) {
        System.out.println("Number " + value);
    }

    // Create show(String)
    Display(String word) {
        System.out.println("Text " + word);
    }
}

public class P13_constructor_overloading {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read both values and call both methods
        int value = scanner.nextInt();
        String word = scanner.next();
        Display d1 = new Display(value);
        Display d2 = new Display(word);
    }
}
