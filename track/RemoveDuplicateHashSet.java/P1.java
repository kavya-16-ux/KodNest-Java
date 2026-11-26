
import java.util.*;

class Student extends Object {

    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        if (this.roll == s.roll && this.name == s.name) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    @Override
    public String toString() {
        return roll + " " + name;
    }

    void display() {
        System.out.println("Roll no:" + roll);
        System.out.println("Name:" + name);
    }

}

public class P1 {

    public static void main(String[] args) {
        Student s1 = new Student(11, "Anu");
        Student s2 = new Student(12, "Raj");
        Student s3 = new Student(11, "Anu");

        HashSet<Student> hs = new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println(hs);
    }
}
