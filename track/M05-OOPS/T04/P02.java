
class Student {

    int roll;
    String name;

    @Override

    public boolean equals(Object obj) {
        Student s = (Student) (obj);
        if (this.roll == s.roll && this.name.equals(s.name)) {
            return true;
        } else {
            return false;
        }
    }

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

public class P02 {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Raja");
        Student s2 = new Student(2, "Rani");
        Student s3 = new Student(1, "Raja");
        System.out.println(s1.equals(s2));// false bcz content is not same 
        System.out.println(s1.equals(s3)); // true bcz convt the equals to check the content not address
    }
}
