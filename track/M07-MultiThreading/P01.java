
import java.util.Scanner;

class Addition extends Thread {

    @Override
    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.println("Addition activity started");
        System.out.println("Enter the a:");
        int a = s.nextInt();
        System.out.println("Enter the b:");
        int b = s.nextInt();
        int res = a + b;
        System.out.println("The addition: " + res);
        System.out.println("Addition activity completed");
    }
}

class PrintNum extends Thread {

    @Override
    public void run() {
        System.out.println("Printing number activity started");
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing number activity completed");
    }
}

class PrintChar extends Thread {

    @Override
    public void run() {
        System.out.println("Printing character activity started");
        for (char i = 'A'; i < 'G'; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Printing character activity completed");
    }
}

public class P01 {

    public static void main(String[] args) {
        Addition ad = new Addition();
        PrintNum pn = new PrintNum();
        PrintChar pc = new PrintChar();
        ad.start(); //or ad.run()
        pn.start();
        pc.start();
    }
}
