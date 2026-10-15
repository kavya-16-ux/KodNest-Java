
import java.util.Scanner;

abstract class Employee {

    private String name;

    Employee(String name) {
        // Initialize name
        this.name = name;
    }

    void showName() {
        // Print name
        System.out.println("Name: " + name);
    }

    abstract void showRole();
}

class Developer extends Employee {

    // Complete constructor and method
    Developer(String name) {
        super(name);
    }

    @Override
    void showRole() {
        System.out.println("Role: Developer");
    }
}

public class P04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        // Create object and call both methods
        Developer d = new Developer(name);
        d.showName();
        d.showRole();

    }
}
