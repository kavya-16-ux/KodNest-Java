import java.util.Scanner;

class Training {
    // Add final showInstitute()
    final void showInstitute(){
        System.out.println("KodNest");
    }
}

final class JavaTraining extends Training {
    // Add final courseCode, constructor and showCourse()
    final String courseCode;
    JavaTraining(String courseCode){
        this.courseCode = courseCode;
    }
    void showCourse(){
        System.out.println("Course: " + courseCode);
    }
}

public class P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();

        // Create JavaTraining and display details
        JavaTraining j = new JavaTraining(code);
        j.showInstitute();
        j.showCourse();
        scanner.close();
    }
}
