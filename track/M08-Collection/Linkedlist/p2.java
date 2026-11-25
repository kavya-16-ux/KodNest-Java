
import java.util.*;

public class p2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            ll.add(scan.nextInt());
        }
        System.out.println(ll.size());
        System.out.println(ll);
    }
}
