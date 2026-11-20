
import java.util.Scanner;

class addition extends Thread {

    @Override
    public void run() {
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
}

class printNum extends Thread {

    @Override
    public void run() {
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

class printChar extends Thread {

    @Override
    public void run() {
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

}

public class P07_joinmethod {

    public static void main(String[] args) {
        System.out.println("Main task start");
        addition ad = new addition();
        printNum pn = new printNum();
        printChar pc = new printChar();
        ad.start();
        pn.start();
        pc.start();
        try {
            ad.join();
            pn.join();
            pc.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Main task completed");
    }
}
