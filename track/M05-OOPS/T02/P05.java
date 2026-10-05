
class Parent {

    Parent() {
        System.out.println("Inside parent 0 parameter constructor");
    }
}

class Child extends Parent {

    Child() {
        this(10); // to call the another constructor of same class
        System.out.println("Inside child 0 parameter constructor");
    }

    Child(int a) {
        super(); // to call the parent default constructor
        System.out.println("Child 1 parameter constructor");
    }
}

public class P05 {

    public static void main(String[] args) {
        Child c = new Child();
    }
}
