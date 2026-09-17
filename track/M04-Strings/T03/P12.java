
import java.util.Scanner;

class Message {

    String text;

    Message(String text) {
        // Store the message.
        this.text = text;
    }

    void displayText() {
        // Display the instance text.
        System.out.println("Message: " + text);
    }

    static void displayCourse() {
        // Display the shared course.
        System.out.println("Course: " + "Java");
    }
}

public class P12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create one object and call both methods correctly.
        String text = scanner.nextLine();
        Message m = new Message(text);
        m.displayText();
        Message.displayCourse();
    }
}
