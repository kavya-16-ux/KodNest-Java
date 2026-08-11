
class Employee {

    int id;
    String name;

    void work() {
        System.out.println("Working");
    }
}

public class Prg1_reference {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "kiana";
        System.out.println(e1.id);
        System.out.println(e1.name);

        System.out.println();
        Employee e2;
        e2 = e1;
        e2.id = 13;
        System.out.println(e2.id);
        System.out.println(e2.name);
        System.out.println(e1.id);
        System.out.println(e1.name);
    }
}
