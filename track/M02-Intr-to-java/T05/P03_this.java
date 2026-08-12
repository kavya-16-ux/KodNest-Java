
import java.util.Scanner;

class Student {

    String name;

    void setName(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Student Name: " + this.name);
    }
}

public class P03_this {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Student s1 = new Student();

        s1.setName(name);
        s1.displayName();
    }
}
