
import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        int solvedProblem = scanner.nextInt();
        double assessmentPercentage = scanner.nextDouble();
        System.out.println("Learner: " + firstName);
        System.out.println("Problems solved: " + solvedProblem);
        System.out.println("Assessment: " + assessmentPercentage);
        scanner.close();
    }
}
