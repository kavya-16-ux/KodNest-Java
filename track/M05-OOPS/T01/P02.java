
import java.util.Scanner;

class book {

    private int pageNumber;

    public void setData(int x) {
        if (x > 0) {
            pageNumber = x;
        }
    }

    public int getData() {
        return pageNumber;
    }
}

public class P02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        book b = new book();
        b.setData(scan.nextInt());
        System.out.println(b.getData());
    }
}
