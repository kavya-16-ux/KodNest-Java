
public class P04 {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println(s.capacity());//16
        System.out.println(s.length());//0
        s.append("Java Programmings");
        System.out.println(s.capacity());
        System.out.println(s.length());
        s.delete(3, 6);
        System.out.println(s);
        s.reverse();
        System.out.println(s);

    }
}
