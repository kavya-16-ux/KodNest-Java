
import java.util.Scanner;

class book {

    private int pageNumber;

    public void setData(int x) {
        if (x > 0) {
            pageNumber = x;
        }
    }

    public void getData() {
        System.out.println(pageNumber);
    }
}

public class P01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        book b = new book();
        b.setData(scan.nextInt());
        b.getData();
    }
}
