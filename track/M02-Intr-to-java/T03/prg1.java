
import java.util.Scanner;

public class prg1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = input.nextInt();
        if (marks >= 60) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
