
class Student {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        name = name;
        age = age;
        height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class Prg1_withoutusingthis {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input("Kiana", 16, 4.5);
        s1.display();
    }
}
