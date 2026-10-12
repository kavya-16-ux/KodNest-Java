
import java.util.Scanner;

class Student {

    int id;

    Student(int id) {
        this.id = id;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        if (this.id == s.id) {
            return true;
        } else {
            return false;
        }
    }

}

public class P06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstId = scanner.nextInt();
        int secondId = scanner.nextInt();

        Student s1 = new Student(firstId);
        Student s2 = new Student(secondId);
        if (s1.equals(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        // Create two students and compare them
        scanner.close();
    }
}
