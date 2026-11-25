
import java.util.*;

public class P4 {

    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("Anu");
        al.add("Ravi");
        System.out.println(al);
        al.add(1, "Raghu");
        System.out.println(al);
        al.set(1, "Banu");
        System.out.println(al);
    }
}
