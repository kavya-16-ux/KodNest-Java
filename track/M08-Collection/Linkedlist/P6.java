
import java.util.ArrayList;
import java.util.Scanner;

class P6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            marks.add(sc.nextInt());
        }
        int total = 0;
        // TODO: loop over marks and add every value to total
        for (int i = 0; i < 3; i++) {
            total = total + marks.get(i);
        }
        // TODO: print total
        System.out.println(total);
    }
}
