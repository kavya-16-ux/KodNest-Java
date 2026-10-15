
import java.util.Scanner;

interface Printable {

    void print();
}

class Ticket implements Printable {

    // Add code, constructor and print()
    String code;

    Ticket(String code) {
        this.code = code;
    }

    @Override
    public void print() {
        System.out.println("Ticket: " + code);
    }
}

public class P09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();
        // Create Printable reference and call print()

        Printable p = new Ticket(code);
        p.print();
    }
}
