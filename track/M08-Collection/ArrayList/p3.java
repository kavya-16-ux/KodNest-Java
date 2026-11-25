
import java.util.ArrayList;
import java.util.Scanner;

class P3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> names = new ArrayList<String>();
        // TODO: Read and add n names.
        for (int i = 0; i < n; i++) {
            String m = sc.next();
            names.add(m);
        }
        // TODO: Print the current size of names.
        System.out.println(names.size());
    }
}
