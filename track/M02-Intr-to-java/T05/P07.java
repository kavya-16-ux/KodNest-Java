
import java.util.Scanner;

class Student {

    String name;

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Student Name: " + name);
    }

    void showScore(int first) {
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        int total = first + second;
        System.out.println("Two-Score Total: " + total);
    }
}

public class P07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        Student s1 = new Student();

        s1.setName(name);
        s1.showName();
        s1.showScore(first);
        s1.showScore(first, second);
    }
}
