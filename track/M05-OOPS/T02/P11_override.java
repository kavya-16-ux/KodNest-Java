
class Parent {

    void displ1() {
        System.out.println("Parent displ1 class");
    }

    void displ2() {
        System.out.println("Parent displ2 class");
    }
}

class Child extends Parent {

    @Override
    void displ2() {
        System.out.println("Child displ2 class"); // chnage the body of parent clas method
    }

    void displ3() {
        System.out.println("Child displ3 class");
    }
}

public class P11_override {

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.displ1();
        c1.displ2();
        c1.displ3();
    }
}
