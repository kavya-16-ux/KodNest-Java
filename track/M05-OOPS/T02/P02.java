
import java.util.Scanner;

class Person {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println(name);
    }
}

class Student extends Person {

}

public class P02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scanner.next();

        Student student = new Student();
        student.setName(name);
        student.displayName();
    }
}
