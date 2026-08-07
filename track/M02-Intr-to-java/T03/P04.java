
import java.util.Scanner;

public class P04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int practice = scanner.nextInt();
        int solvedCount = 0;

        for (int i = 1; i <= practice; i++) {
            int solve = scanner.nextInt();
            solvedCount += solve;
        }

        double dailyAvg = (double) solvedCount / practice;
        String res = dailyAvg >= 5.0 ? "Consistent" : "Needs consistency";

        System.out.println("Learner: " + name);
        System.out.println("Total solved: " + solvedCount);
        System.out.println("Daily average: " + dailyAvg);
        System.out.println("Status: " + res);

        scanner.close();
    }
}
