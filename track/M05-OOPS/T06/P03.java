
import java.util.Scanner;

class Mentor {

    private String name;

    Mentor(String name) {
        // Initialize name
        this.name = name;
    }

    void guide(String studentName) {
        // Print the relationship
        System.out.println(name + " guides " + studentName);

    }
}

class Student {

    private String name;

    Student(String name) {
        // Initialize name
        this.name = name;
    }

    void learnFrom(Mentor mentor) {
        // Ask the mentor to guide this student
        mentor.guide(name);
    }
}

public class P03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        String mentorName = scanner.nextLine();

        // Create both objects and connect them
        Mentor mentor = new Mentor(mentorName);
        Student student = new Student(studentName);
        student.learnFrom(mentor);
    }
}
