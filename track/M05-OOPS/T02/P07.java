
class Parent {

    int a = 10;
}

class Child extends Parent {

    int a = 20;

    void display() {
        System.out.println("Parent a =" + super.a);
        System.out.println("Child a = " + a);
    }
}

public class P07 {

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
