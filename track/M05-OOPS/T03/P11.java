
import java.util.Scanner;

class Vehicle {

    public void move(int speed) {
        System.out.println("Vehicle " + speed);
    }
}

class Car extends Vehicle {

    // Override move()
    @Override
    public void move(int speed) {
        System.out.println("Car " + speed);

    }
}

public class P11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        // Complete the program using a Vehicle reference
        Car c = new Car();
        c.move(speed);
    }
}
