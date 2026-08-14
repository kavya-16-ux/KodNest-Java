
class Student {

    Student(String kiana, int par, double par1) {
    }

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}

public class Prg1 {

    public static void main(String[] args) {
        Student s = new Student("kiana", 14, 5.4);
        s.input("kiana", 14, 6.7);
        s.display();
    }
}
