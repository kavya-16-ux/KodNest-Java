
import java.util.Objects;
import java.util.Scanner;

class Book {

    int bookId;

    Book(int bookId) {
        this.bookId = bookId;
    }

    // Override equals() and hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(bookId);
    }

    @Override
    public boolean equals(Object obj) {
        Book b = (Book) obj;
        if (this.bookId == b.bookId) {
            return true;
        } else {
            return false;
        }
    }
}

public class P13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        // Create two equal books and verify the contract
        Book b1 = new Book(id);
        Book b2 = new Book(id);
        System.out.println(b1.hashCode() == b2.hashCode());
        System.out.println(b1.equals(b2));
        scanner.close();
    }
}
