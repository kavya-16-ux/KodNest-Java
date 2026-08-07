
import java.util.Scanner;

public class Prg2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values:");
        int age = input.nextInt();
        double percentage = input.nextDouble();
        String skill = input.next();
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
        System.out.println("Skills: " + skill);

    }
}
