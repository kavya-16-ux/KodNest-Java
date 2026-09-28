
import java.util.*;

class Age {

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}

public class P04 {

    public static void main(String[] args) {
        Age a = new Age();
        Scanner scan = new Scanner(System.in);
        a.setAge(scan.nextInt());
        System.out.println(a.getAge());
    }
}
