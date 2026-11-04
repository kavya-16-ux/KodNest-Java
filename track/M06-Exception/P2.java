
import java.util.Scanner;

class P1 {

    public static void main(String[] args) {
        System.out.println("Connection Established");
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the a value:");
            int a = s.nextInt();
            System.out.println("Enter the b value:");
            int b = s.nextInt();
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Division cant be zero");
            System.out.println("Connection terminate");
        }
    }
}
