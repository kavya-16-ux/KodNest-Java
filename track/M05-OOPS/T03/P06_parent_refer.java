
import java.util.Scanner;

class Animal {

    public void makeSound(String sound) {
        System.out.println("Animal " + sound);
    }
}

class Dog extends Animal {

    @Override
    public void makeSound(String sound) {
        // Print Dog and sound
        System.out.println("Dog " + sound);
    }
}

public class P06_parent_refer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read sound
        String sound = scanner.next();
        // Store Dog in an Animal reference
        Animal a = new Dog();
        // Call makeSound()
        a.makeSound(sound);
    }
}
