
import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        return 7;
    }

    int add(int first, int second) {
        return first + second;
    }
}

public class P01_allMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        MethodDemo d = new MethodDemo();

        d.sayHello();
        d.greet(name);

        int luckyNumber = d.getLuckyNumber();
        System.out.println("Lucky Number: " + luckyNumber);

        int add = d.add(first, second);
        System.out.println("Sum: " + add);
    }
}
