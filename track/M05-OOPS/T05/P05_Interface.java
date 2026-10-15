
interface Shape {

    abstract public void input();

    abstract public void area();
}

class Circle implements Shape {

    @Override
    public void input() {
        System.out.println("Input");
    }

    @Override
    public void area() {
        System.out.println("Area");
    }
}

public class P05_Interface {

    public static void main(String[] args) {
        // Circle c = new Circle();
        //c.input();
        //c.area();

        Shape s = new Circle();
        s.input();
        s.area();
    }
}
