
import java.util.Scanner;

abstract class Message {

    abstract void send();
}

class SMS extends Message {

    // Add number, constructor and send()
    String num;

    SMS(String num) {
        this.num = num;
    }

    @Override
    void send() {
        System.out.println("SMS sent to " + num);
    }
}

public class P12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        // Create object and call send()
        Message m = new SMS(number);
        m.send();
    }
}
