
abstract class Parent {

    abstract void disp1();

    abstract void disp2();
}

class Child1 extends Parent {

    @Override
    void disp1() {
        System.out.println("Child1 disp1");
    }

    @Override
    void disp2() {
        System.out.println("Child1 disp2");
    }
}

class Child2 extends Parent {

    @Override
    void disp1() {
        System.out.println("Child2 disp1");
    }

    @Override
    void disp2() {
        System.out.println("Child2 disp2");
    }
}

public class P01_abstraction {

    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        AccessMethod(c1);
        AccessMethod(c2);
    }

    static void AccessMethod(Parent p) {
        p.disp1();
        p.disp2();
    }
}
