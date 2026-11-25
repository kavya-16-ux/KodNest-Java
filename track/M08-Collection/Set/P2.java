
import java.util.HashSet;

public class P2 {

    public static void main(String[] args) {
        HashSet h = new HashSet();
        //Set h = new HashSet();
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(20);
        System.out.println(h);
        h.remove(20); // no index remove bcz we dont know iteration order
        System.out.println(h);
    }
}
