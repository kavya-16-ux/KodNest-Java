
import java.util.Scanner;

class Attendance {

    private int presentDays;

    public void addDays(int days) {
        // Add only a positive value
        if (days > 0) {
            this.presentDays = days;
        }
    }

    public int getPresentDays() {
        // Return presentDays
        return presentDays;
    }
}

public class P11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        int days = scanner.nextInt();
        Attendance a = new Attendance();
        a.addDays(days);
        System.out.print(a.getPresentDays());
    }
}
