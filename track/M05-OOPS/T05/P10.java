
import java.util.Scanner;

interface Notifiable {

    void notifyUser();
}

class EmailAlert implements Notifiable {

    String message;

    EmailAlert(String message) {
        // Store message
        this.message = message;
    }

    @Override
    public void notifyUser() {
        // Print alert
        System.out.println("Email alert: " + message);
    }
}

public class P10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();
        // Use a Notifiable reference
        Notifiable n = new EmailAlert(message);
        n.notifyUser();
    }
}
