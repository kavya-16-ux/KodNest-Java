
import java.util.Scanner;

class Book {

    int bookId;

    Book(int bookId) {
        this.bookId = bookId;
    }

    // Override equals() and hashCode()
    @Override
    public boolean equals(Object obj) {
        Book b = (Book) obj;
        if (this.bookId == b.bookId) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return bookId;
    }
}

public class P05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstId = scanner.nextInt();
        int secondId = scanner.nextInt();
        Book book1 = new Book(firstId);
        Book book2 = new Book(secondId);

        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode() == book2.hashCode());

        // Create and compare two books
        scanner.close();
    }
}
