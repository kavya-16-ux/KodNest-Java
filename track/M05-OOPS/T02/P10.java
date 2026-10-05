
import java.util.Scanner;

class Person {

    Person(String name) {
        // Print the parent message
        System.out.println("Person: " + name);
    }
}

class Student extends Person {

    Student(String name) {
        // Call the parent constructor
        super(name);
        // Print the child message
        System.out.println("Student created");
    }
}

public class P10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name
        System.out.println("Enter the name:");
        String name = scanner.next();
        // Create Student
        Student s = new Student(name);
    }
}
