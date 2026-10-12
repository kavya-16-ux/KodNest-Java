
class Student {

    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println(roll);
        System.out.println(name);
    }
}

public class P01 {

    public static void main(String[] args) {
        Student s = new Student(11, "Arjun");
        Student s1 = new Student(12, "Ashwini");
        Student s2 = new Student(11, "Arjun");
        s.display();
        s1.display();
        s2.display();
        System.out.println(s.equals(s1));//address the diff so false
        System.out.println(s.equals(s2));//in objet the equals check the address not content so false

    }

}
