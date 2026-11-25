
import java.util.ArrayList;
import java.util.Scanner;

class P7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<Integer>();
        // TODO: read and store two integer scores
        int first = sc.nextInt();
        int second = sc.nextInt();
        marks.add(first);
        marks.add(second);
        // TODO: print the first and second entries separately
        System.out.println(marks.get(0));
        System.out.println(marks.get(1));
    }
}
