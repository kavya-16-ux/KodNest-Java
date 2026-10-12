
import java.util.Objects;

class Student {

    int roll;
    String name;

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        if (this.roll == s.roll && this.name.equals(this.name)) {
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

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

}

public class P04 {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Arjun");
        Student s2 = new Student(2, "Raja");
        Student s3 = new Student(1, "Arjun");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1); // original value bcz override the toString 
        //method convt the hashcode/address to value
        System.out.println(s2);
        System.out.println(s3);
    }
}
