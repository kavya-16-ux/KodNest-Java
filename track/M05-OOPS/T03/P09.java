
import java.util.Scanner;

class Animal {

    public void makeSound(String sound) {
        System.out.println("Animal " + sound);
    }
}

class Dog extends Animal {

    // Override makeSound()
    @Override
    public void makeSound(String sound) {
        System.out.println("Dog " + sound);
    }
}

public class P09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        String sound = scanner.next();
        Dog d = new Dog();
        d.makeSound(sound);
    }
}
