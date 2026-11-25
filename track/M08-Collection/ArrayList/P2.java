
import java.util.ArrayList;
import java.util.Scanner;

class p2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> names = new ArrayList<String>();
        // TODO: Add the n names using a loop.
        for (int i = 0; i < n; i++) {
            String m = sc.next();
            names.add(m);
        }
        // TODO: Print only the first element.
        System.out.println(names.get(0));
    }
}
