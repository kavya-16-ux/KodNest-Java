
import java.util.Scanner;

class Student {

    private int marks;

    public boolean setMarks(int marks) {
        // Validate and store marks
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            return true;
        }
        return false;
    }

    public int getMarks() {
        // Return marks
        return marks;
    }
}

public class P10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        int marks = scanner.nextInt();
        Student s = new Student();
        s.setMarks(marks);
        if (s.setMarks(marks) == true) {
            System.out.println(s.getMarks());
        } else {
            System.out.println("Invalid marks");
        }
    }
}
