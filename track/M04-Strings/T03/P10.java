
import java.util.Scanner;

class Learner {

    String learnerName;
    static String instituteName;

    Learner(String learnerName) {
        // Store the object-specific name.
        this.learnerName = learnerName;
    }

    void display() {
        // Display the name and shared institute.
        System.out.println(learnerName + " - " + instituteName);
    }
}

public class P10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the shared institute and two names names.
        String instituteName = scanner.nextLine();
        String learnerName1 = scanner.nextLine();
        String learnerName2 = scanner.nextLine();
        Learner.instituteName = instituteName;
        // Create and display two learners.
        Learner l1 = new Learner(learnerName1);
        Learner l2 = new Learner(learnerName2);
        l1.display();
        l2.display();
    }
}
