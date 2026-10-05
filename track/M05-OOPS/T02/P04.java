
class Parent {

    Parent() {
        System.out.println("Parent constructor");
    }

    Parent(int a) {
        System.out.println("Parent of one constructor ");
    }
}

class Child extends Parent {

    Child() {
        super();
        System.out.println("Child constructor execute");
    }

    Child(int a) {
        System.out.println("Child of one parameter constructor");
    }
}

public class P04 {

    public static void main(String[] args) {
        Child c = new Child();
    }
}
