
import java.util.Scanner;

final class StudentRecord {

    // Add private final fields, constructor and getters
    private final int student_id;
    private final String name;

    StudentRecord(int student_id, String name) {
        this.student_id = student_id;
        this.name = name;
    }

    void get() {
        System.out.println("ID: " + student_id);
        System.out.println("Name: " + name);
    }
}

public class P08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = scanner.next();

        // Create the immutable object and print its data
        StudentRecord s = new StudentRecord(id, name);
        s.get();

        scanner.close();
    }
}
