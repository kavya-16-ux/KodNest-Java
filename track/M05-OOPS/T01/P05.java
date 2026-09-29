
import java.util.Scanner;

class Employee {

    private int age;

    public boolean setAge(int age) {
        // Validate and store age
        if (age >= 18 && age <= 60) {
            this.age = age;
            return true;
        } else {
            return false;
        }
    }

    public int getAge() {
        // Return the stored age
        return age;
    }
}

public class P05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read age and attempt the update
        int age = scanner.nextInt();
        // Print the required result
        Employee e = new Employee();
        e.setAge(age);
        if (e.setAge(age) == true) {
            System.out.print(e.getAge());
        } else {
            System.out.println("Invalid age");
        }
    }
}
