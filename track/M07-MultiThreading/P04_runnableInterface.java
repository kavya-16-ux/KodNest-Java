
import java.util.*;

class Addition implements Runnable {

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

class PrintNum implements Runnable {

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

class PrintChar implements Runnable {

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

public class P04_runnableInterface {

    public static void main(String[] args) {
        Addition ad = new Addition();
        PrintNum pn = new PrintNum();
        PrintChar pc = new PrintChar();

        Thread t1 = new Thread(ad);
        Thread t2 = new Thread(pn);
        Thread t3 = new Thread(pc);
        t1.start();
        t2.start();
        t3.start();
    }
}
