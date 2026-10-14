
import java.util.Scanner;

abstract class Vehicle {

    abstract void start();
}

class Bike extends Vehicle {

    String brand;

    Bike(String brand) {
        // Store the brand
        this.brand = brand;
    }

    @Override
    void start() {
        // Print the required output
        System.out.println(brand + " bike started");
    }
}

public class P03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.next();
        // Create Vehicle reference and call start()
        Bike b = new Bike(brand);
        AccessMethod(b);
    }

    static void AccessMethod(Vehicle v) {
        v.start();
    }
}
