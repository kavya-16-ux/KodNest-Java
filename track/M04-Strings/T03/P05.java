
import java.util.Scanner;

class Demo {

    static {
        // Print the class-initialization message.
        System.out.println("Static block executed");
    }

    Demo() {
        // Print the constructor message.
        System.out.println("Constructor executed");
    }
}

public class P05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        // Create count Demo objects.
        Demo d = new Demo();
    }
}
