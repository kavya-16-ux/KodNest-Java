
import java.util.Scanner;

class Student {

    private String name;
    private int age;

    Student(String name) {
        // Call the two-argument constructor
        this(name, 18);
    }

    Student(String name, int age) {
        // Initialize both fields
        this.name = name;
        this.age = age;

    }

    public void display() {
        // Print name and age
        System.out.println(name + " " + age);
    }
}

public class P08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        // Create Student using the one-argument constructor
        Student s = new Student(name);
        // Display the values
        s.display();
    }
}
