
class Addition {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

}

public class Prg2_methodOverload {

    public static void main(String[] args) {
        Addition a1 = new Addition();
        System.out.println(a1.add(10.0, 20));
    }
}
