
import java.util.Scanner;

class NotificationTask implements Runnable {

    private String message;
    private int count;

    NotificationTask(String message, int count) {
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

class P06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        int n = sc.nextInt();
        // Start a Thread(new NotificationTask(message, n)).
        NotificationTask nt = new NotificationTask(message, n);
        Thread t = new Thread(nt);
        t.start();
    }

}
