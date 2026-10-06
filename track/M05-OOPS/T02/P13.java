
import java.util.Scanner;

class Animal {

    public void displayType(String type) {
        // Print type
        System.out.println(type);
    }
}

class Dog extends Animal {

}

public class P13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read type
        String type = scanner.next();
        // Create Dog
        Dog d = new Dog();
        // Call the inherited method
        d.displayType(type);
    }
}
