
import java.util.Scanner;

class Employee {

    int id;

    Employee(int id) {
        this.id = id;
    }
}

public class P11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        // Create first, alias and second references
        Employee e1 = new Employee(id);
        Employee e2 = new Employee(id);
        System.out.println(e1 == e1);
        System.out.println(e1 == e2);
        scanner.close();
    }
}
