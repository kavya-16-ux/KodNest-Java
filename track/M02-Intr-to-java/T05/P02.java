
import java.util.Scanner;

class StudentUtility {

    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    double getPassingPercentage() {
        return 60.0;
    }

    double calculatePercentage(int javaScore, int sqlScore) {
        return (javaScore + sqlScore) / 2.0;
    }
}

public class P02 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            StudentUtility utility = new StudentUtility();

            int id = scanner.nextInt();
            scanner.nextLine();

            String name = scanner.nextLine();
            int javaScore = scanner.nextInt();
            int sqlScore = scanner.nextInt();

            utility.showReportTitle();
            utility.displayStudent(id, name);

            double res = utility.getPassingPercentage();
            double avg = utility.calculatePercentage(javaScore, sqlScore);

            System.out.println("Percentage: " + avg);

            if (avg >= res) {
                System.out.println("Result: PASS");
            } else {
                System.out.println("Result: NEEDS IMPROVEMENT");
            }
        }
    }
}
