
class Student {

    String name;
    int age;
    double height;

    Student() {
        name = "Shradda";
        age = 14;
        height = 5.6;
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Height" + height);
    }
}

public class Prg2 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Aani");
        s2.display();
        Student s3 = new Student("kiana", 15, 5.5);
        s3.display();
    }
}
