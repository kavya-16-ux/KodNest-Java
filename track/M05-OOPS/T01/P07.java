
import java.util.Scanner;

class Student {

    private int age;

    // Create setAge()
    public void age(int age) {
        this.age = age;
    }

    // Create displayAge()
    public int returnAge() {
        return age;
    }
}

public class P07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        int age = scanner.nextInt();
        Student s = new Student();
        s.age(age);
        System.out.println(s.returnAge());

    }
}
