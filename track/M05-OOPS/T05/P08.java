
import java.util.Scanner;

interface Readable {

    void read();
}

interface Writable {

    void write();
}

class Notebook implements Readable, Writable {

    // Add name, constructor and both methods
    String name;

    Notebook(String name) {
        this.name = name;
    }

    @Override
    public void read() {
        System.out.println(name + " opened");
    }

    @Override
    public void write() {
        System.out.println(name + " saved");
    }
}

public class P08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        // Create Notebook and call both methods
        Notebook n = new Notebook(name);
        n.read();
        n.write();
    }
}
