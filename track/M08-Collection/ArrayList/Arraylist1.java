
import java.util.*;

public class Arraylist1 {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 1; i <= n; i++) {
            int element = scan.nextInt();
            a.add(element);
        }
        System.out.println("ArrayList:" + a);
        System.out.println("");
        System.out.println("Traverse using for loop");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + "");
        }
        System.out.println("");
        System.out.println("Travserse using advance for loop");
        for (Object x : a) { // instead of Object use Integer
            System.out.println(x);
        }
    }
}
