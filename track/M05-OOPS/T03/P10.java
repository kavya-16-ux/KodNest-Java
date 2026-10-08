
import java.util.Scanner;

class Notification {

    public void send(String message) {
        System.out.println("Notification " + message);
    }
}

class EmailNotification extends Notification {

    // Override send()
    @Override
    public void send(String message) {
        System.out.println("Email " + message);
    }
}

public class P10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();
        // Complete the program
        EmailNotification e = new EmailNotification();
        e.send(message);
    }
}
