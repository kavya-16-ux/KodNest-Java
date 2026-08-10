
class Student {

    int roll_number;
    String name;
    double height;

    void run() {
        System.out.println("Running");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

public class Prg3_class {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll_number = 101;
        s1.name = "Kiana";
        s1.height = 3.5;
        System.out.println(s1.roll_number);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleep();
    }
}
