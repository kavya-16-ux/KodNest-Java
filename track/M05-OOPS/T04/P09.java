
import java.util.Scanner;

class Product {

    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override toString()
    public String toString() {
        return "Product: " + id + " - " + name;
    }
}

public class P09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = scanner.next();

        // Create and print Product
        Product p = new Product(id, name);
        System.out.println(p);

        scanner.close();
    }
}
