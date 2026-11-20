
import java.util.Scanner;

class MessageWorker extends Thread {

    private String message;
    private int count;

    MessageWorker(String message, int count) {
        this.message = message;
        this.count = count;
    }

    public void run() {
        // Print message count times.
        for (int i = 1; i <= count; i++) {
            System.out.println(message);
        }

    }
}

class p03_MultiThread {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        int count = sc.nextInt();
        // Start one MessageWorker.
        MessageWorker m = new MessageWorker(message, count);
        m.start();
    }
}
