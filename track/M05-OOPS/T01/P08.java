
import java.util.Scanner;

class Course {

    private double fee;

    Course(double fee) {
        // Store fee
        this.fee = fee;
    }

    // Create getFee()
    public double getFee() {
        return fee;
    }

}

public class P08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        double fee = scanner.nextDouble();
        Course c = new Course(fee);
        System.out.println(c.getFee());
    }
}
