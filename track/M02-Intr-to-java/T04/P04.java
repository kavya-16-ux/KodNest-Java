
import java.util.Scanner;

class Student {

    int registrationId;
    String name;
    double attendancePercentage;
}

public class P04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student first = new Student();
        first.registrationId = scanner.nextInt();
        first.name = scanner.next();
        first.attendancePercentage = scanner.nextDouble();

        Student second = new Student();
        second.registrationId = scanner.nextInt();
        second.name = scanner.next();
        second.attendancePercentage = scanner.nextDouble();

        int selectedId = scanner.nextInt();
        double attendance = scanner.nextDouble();

        Student selectedStudent = null;

        if (selectedId == first.registrationId) {
            selectedStudent = first;
        } else if (selectedId == second.registrationId) {
            selectedStudent = second;
        }

        if (selectedStudent == null) {
            System.out.println("Student not found.");
        } else {
            selectedStudent.attendancePercentage = attendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        }

        System.out.println(first.registrationId + " - " + first.name + " - " + first.attendancePercentage + "%");
        System.out.println(second.registrationId + " - " + second.name + " - " + second.attendancePercentage + "%");
    }
}
