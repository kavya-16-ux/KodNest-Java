
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Monkey extends Animal {

    @Override
    void eat() {
        System.out.println("Monkey steals and eat");
    }
}

class Tiger extends Animal {

    @Override
    void eat() {
        System.out.println("Tiger hunt and eat");
    }
}

public class P12_override {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Monkey m = new Monkey();
        m.eat();
        Tiger t = new Tiger();
        t.eat();
    }
}
