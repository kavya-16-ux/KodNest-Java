
import java.util.Scanner;

class Product {

    private double price;

    public boolean setPrice(double price) {
        // Validate and store
        if (price >= 0) {
            this.price = price;
            return true;
        } else {
            return false;
        }
    }

    public double getPrice() {
        // Return price
        return price;
    }
}

public class P09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        double price = scanner.nextDouble();
        Product p = new Product();
        p.setPrice(price);
        if (p.setPrice(price) == true) {
            System.out.print(p.getPrice());
        } else {
            System.out.println("Invalid price");
        }
    }
}
