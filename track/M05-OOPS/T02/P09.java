
import java.util.Scanner;

class Person {

    private String name;

    Person(String name) {
        // Initialize name
        this.name = name;
    }

    public String getName() {
        // Return name
        return name;
    }
}

class Student extends Person {

    private int marks;

    Student(String name, int marks) {
        // Call the parent constructor
        super(name);
        // Initialize marks
        this.marks = marks;
    }

    public void display() {
        // Print name and marks
        System.out.print(getName() + " " + marks);
    }
}

public class P09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.println("Enter the name:");
        String name = scanner.next();
        System.out.println("Enter the marks:");
        int marks = scanner.nextInt();
        // Create Student
        Student s = new Student(name, marks);
        // Display values
        s.display();
    }
}
