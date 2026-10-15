
import java.util.Scanner;

abstract class Animal {

    abstract void sound();
}

class Dog extends Animal {

    // Add name, constructor and sound()
    String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    void sound() {
        System.out.println(name + " says Woof");
    }
}

public class P13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        // Create Animal reference and call sound()
        Dog d = new Dog(name);
        AccessMethod(d);
    }

    public static void AccessMethod(Animal a) {
        a.sound();
    }
}
