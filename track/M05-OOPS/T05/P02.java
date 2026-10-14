
abstract class Vehicle {

    abstract void move();
}

class Bike extends Vehicle {

    @Override
    void move() {
        System.out.println("Bike moves");
    }
}

public class P02 {

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.move();
    }
}
