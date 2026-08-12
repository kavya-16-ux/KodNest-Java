
import java.util.Scanner;

class Employee {

    String name;
    double salary;

    void setDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class P04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double salary = scanner.nextDouble();

        Employee e1 = new Employee();
        e1.setDetails(name, salary);
        e1.displayDetails();
    }
}
