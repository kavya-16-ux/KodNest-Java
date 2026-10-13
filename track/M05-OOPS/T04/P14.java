
import java.util.Scanner;

class Course {

    // Add private final courseCode,
    private final String code;

    // constructor and display method
    Course(String code) {
        this.code = code;
    }

    void display() {
        System.out.println("Course: " + code);
    }
}

public class P14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();

        // Create Course and display the code
        Course c = new Course(code);
        c.display();
        scanner.close();
    }
}
