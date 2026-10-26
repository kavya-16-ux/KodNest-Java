
class Heart {

    Heart() {
        System.out.println("Heart constructor");
    }

    void printheart() {
        System.out.println("Heart method");
    }
}

class Person {

    Heart h = new Heart();

    Person() {
        System.out.println("Person Constructor");
    }
}

class P04 {

    public static void main(String[] args) {
        Person p = new Person();
        p.h.printheart();
    }
}
