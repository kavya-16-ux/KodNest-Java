
import java.util.Scanner;

final class Enrollment {

    // Add private final fields,
    private final int id;
    private final String course;

    // constructor and getters
    Enrollment(int id, String course) {
        this.id = id;
        this.course = course;
    }

    public void getEnroll() {
        System.out.println("Enrollment: " + id);
        System.out.println("Course: " + course);
    }

}

public class P15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String course = scanner.next();

        // Create Enrollment and display values
        Enrollment e = new Enrollment(id, course);
        e.getEnroll();
        scanner.close();
    }
}
