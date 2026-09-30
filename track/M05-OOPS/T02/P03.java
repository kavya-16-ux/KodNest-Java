
import java.util.Scanner;

class Person {

    private String name;

    public void setName(String name) {
        // Store the name
        this.name = name;
    }

    public String displayWelcome() {
        // Print Welcome followed by the name
        return "Welcome " + name;
    }
}

class Employee extends Person {

}

public class P03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name
        System.out.println("Enter the name");
        String name = scanner.next();
        // Create an Employee
        Employee e = new Employee();
        // Call the inherited methods
        e.setName(name);
        String store = e.displayWelcome();
        System.out.println(store);
    }
}
