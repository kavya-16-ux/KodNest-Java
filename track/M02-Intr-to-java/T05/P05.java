
import java.util.Scanner;

class Printer {

    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String word) {
        System.out.println("Word: " + word);
    }
}

public class P05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        String word = scanner.nextLine();

        Printer p1 = new Printer();
        p1.show(number);
        p1.show(word);
    }
}
