
class Parent {

    Parent() {
        System.out.println("Inside Parent 0 parameter const");
    }

    Parent(int a) {
        System.out.println("Inside parent 1 parameter const");
    }
}

class Child extends Parent {

    Child() {
        this(10);
        System.out.println("Inside child 0 parameter const");
    }

    Child(int a) {
        this(10, 20);
        System.out.println("Inside child 1 parameter const");
    }

    Child(int a, int b) {
        super(10); // to call parent parameterized constructor
        System.out.println("Inside child 2 parameter const");
    }

}

public class P06 {

    public static void main(String[] args) {
        Child c = new Child();
    }
}
