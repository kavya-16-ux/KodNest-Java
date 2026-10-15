
import java.util.Scanner;

interface Switchable {

    void switchOn();
}

interface Chargeable {

    void charge();
}

class Phone implements Switchable, Chargeable {

    String name;

    Phone(String name) {
        // Store name
        this.name = name;
    }

    // Implement both methods
    @Override
    public void switchOn() {
        System.out.println(name + " switched on");
    }

    @Override
    public void charge() {
        System.out.println(name + " charging");
    }
}

public class P14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        // Create Phone and call both methods
        Phone p = new Phone(name);
        p.switchOn();
        p.charge();
    }
}
