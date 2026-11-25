
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class P6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            names.add(sc.next());
        }
        int index = sc.nextInt();
        String corrected = sc.next();
        // TODO: correct the name and print the list
        names.set(index, corrected);
        System.out.println(names);
    }
}
