
import java.util.Scanner;

class Message {

    public void show(String text) {
        System.out.println("Message " + text);
    }
}

class EmailMessage extends Message {

    // Override show()
    @Override
    public void show(String text) {
        System.out.println("Email " + text);
    }
}

class SmsMessage extends Message {

    // Override show()
    @Override
    public void show(String text) {
        System.out.println("SMS " + text);
    }
}

public class P12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input, select object and call show()
        int choice = scanner.nextInt();
        String text = scanner.next();
        Message m;
        switch (choice) {
            case 1:
                m = new EmailMessage();
                m.show(text);
                break;
            case 2:
                m = new SmsMessage();
                m.show(text);
                break;
            default:
                break;
        }

    }
}
