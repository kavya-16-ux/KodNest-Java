
import java.util.Scanner;

class Person {

    private String name;

    // Create setName()
    public void setName(String name) {
        this.name = name;
    }
    // Create getName()

    public void getName() {
        System.out.println(name);
    }
}

class Employee extends Person {

}

public class P14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        String name = scanner.next();
        Employee e = new Employee();
        e.setName(name);
        e.getName();
    }
}
