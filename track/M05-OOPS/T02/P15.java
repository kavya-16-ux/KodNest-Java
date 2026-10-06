
import java.util.Scanner;

class Product {

    private String name;
    private int price;

    Product(String name) {
        // Call the two-argument constructor
        this(name, 100);
    }

    Product(String name, int price) {
        // Initialize fields
        this.name = name;
        this.price = price;
    }

    public void display() {
        // Print values
        System.out.print(name + " " + price);
    }
}

public class P15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        String word = scanner.next();
        Product p = new Product(word);
        p.display();
    }
}
