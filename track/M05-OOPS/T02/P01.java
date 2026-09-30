
class Demo1 {

    int a = 10;

    void display() {
        System.out.println(a);
    }

}

class Demo2 extends Demo1 {

}

public class P01 {

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.display();

    }
}
