
import java.util.Scanner;

class Course {

    private String courseCode;

    Course(String courseCode) {
        // Store courseCode
        this.courseCode = courseCode;
    }

    // Create only a getter
    public void getCourse() {
        System.out.print(courseCode);
    }
}

public class P13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        String courseCode = scanner.nextLine();
        Course c = new Course(courseCode);
        c.getCourse();
    }
}
