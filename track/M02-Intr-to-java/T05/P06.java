
import java.util.Scanner;

class ResultCalculator {

    int getTotal(int first, int second) {
        return (first + second);
    }

    int getTotal(int first, int second, int third) {
        return (first + second + third);
    }
}

public class P06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        ResultCalculator r1 = new ResultCalculator();
        int res1 = r1.getTotal(first, second);
        int res2 = r1.getTotal(first, second, third);

        System.out.println("Two-Mark Total: " + res1);
        System.out.println("Three-Mark Total: " + res2);
    }
}
