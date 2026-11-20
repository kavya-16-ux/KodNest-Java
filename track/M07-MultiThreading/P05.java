
import java.util.Scanner;

class OrderTask implements Runnable {

    private int count;

    OrderTask(int count) {
        this.count = count;
    }

    public void run() {
        // Print each order in sequence.
        for (int i = 1; i <= count; i++) {
            System.out.println("Order " + i + " processed");
        }
    }
}

class P05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Build a Thread with new OrderTask(n) and start it.
        OrderTask ot = new OrderTask(n);
        Thread t = new Thread(ot);
        t.start();
    }
}
