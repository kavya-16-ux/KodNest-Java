
public class P03 {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println(s.capacity());//16
        System.out.println(s.length());//0
        s.append("Java");
        System.out.println(s.capacity());//16
        System.out.println(s.length());//4
        s.insert(0, "Python");
        System.out.println(s);//PythonJava
        s.insert(3, "Prg");
        System.out.println(s);//PytPrghonJava
    }
}
