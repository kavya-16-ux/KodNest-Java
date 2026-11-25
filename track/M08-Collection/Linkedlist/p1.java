
import java.util.LinkedList;

public class p1 {

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        System.out.println(l);
        l.addFirst(5);
        l.addLast(30);
        System.out.println(l);
        l.remove(0);
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
    }
}
