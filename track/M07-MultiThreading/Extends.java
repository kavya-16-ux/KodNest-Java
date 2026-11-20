
import java.util.Scanner;

class Activity extends Thread {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("ADD")) {
            addition();
        } else if (threadName.equals("CHAR")) {
            printChar();
        } else {
            printNum();
        }
    }

    void addition() {
        System.out.println("Addition task start");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the a value");
        int a = scan.nextInt();
        System.out.println("Enter the b value");
        int b = scan.nextInt();
        int res = a + b;
        System.out.println("res: " + res);
        System.out.println("Addition task completed");
    }

    void printChar() {
        System.out.println("printChar task start");
        for (char ch = 'A'; ch < 'H'; ch++) {
            System.out.println(ch);
            try {
                sleep(3000);
            } catch (Exception e) {
                e.getMessage();
            }
        }
        System.out.println("printChar task completed");
    }

    void printNum() {
        System.out.println("printNum task start");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                sleep(3000);
            } catch (Exception e) {
                e.getMessage();
            }
        }
        System.out.println("printNum task completed");
    }
}

public class Extends {

    public static void main(String[] args) {
        Activity ac1 = new Activity();
        Activity ac2 = new Activity();
        Activity ac3 = new Activity();

        ac1.setName("ADD");
        ac2.setName("CHAR");
        ac3.setName("NUM");
        ac1.start();
        ac2.start();
        ac3.start();

    }
}
