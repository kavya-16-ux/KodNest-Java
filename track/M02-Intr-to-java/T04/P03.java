
import java.util.Scanner;

class Learner {

    int id;
    String name;
    int javaScore;
}

public class P03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Learner first = new Learner();
        first.id = scanner.nextInt();
        first.name = scanner.next();
        first.javaScore = scanner.nextInt();

        Learner second = new Learner();
        second.id = scanner.nextInt();
        second.name = scanner.next();
        second.javaScore = scanner.nextInt();

        int newJavaScore = scanner.nextInt();

        System.out.println("Before Update");
        System.out.println(first.id + " - " + first.name + " - " + first.javaScore);
        System.out.println(second.id + " - " + second.name + " - " + second.javaScore);

        first.javaScore = newJavaScore;
        System.out.println("After Update");
        System.out.println(first.id + " - " + first.name + " - " + first.javaScore);
        System.out.println(second.id + " - " + second.name + " - " + second.javaScore);
    }
}
