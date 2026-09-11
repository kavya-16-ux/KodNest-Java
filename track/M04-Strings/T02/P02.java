
public class P02 {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println(s.capacity());//16
        System.out.println(s.length());//0
        s.append("Java");
        System.out.println(s.capacity());//16
        System.out.println(s.length());//4
        s.append(" is a programming language");
        System.out.println(s.capacity());//34
        System.out.println(s.length());//30
        s.append(" and object oriented");
        System.out.println(s.capacity());//70
        System.out.println(s.length());//50

    }
}
