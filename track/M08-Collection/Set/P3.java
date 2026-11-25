
import java.util.LinkedHashSet;

public class P3 {

    public static void main(String[] args) {
        LinkedHashSet hs = new LinkedHashSet();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(20);
        System.out.println(hs);
        hs.remove(20);
        System.out.println(hs);
    }
}
