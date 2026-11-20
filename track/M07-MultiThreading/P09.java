
import java.util.Scanner;

class Counter {

    private int value;

    Counter(int initial) {
        value = initial;
    }

    synchronized void increment() {
        value++;
    }

    synchronized int getValue() {
        return value;
    }
}

class CounterWorker extends Thread {

    private Counter counter;

    CounterWorker(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        // TODO: Call counter.increment() once.
        counter.increment();
    }
}

class P09 {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Counter shared = new Counter(n);

        // Create two CounterWorker objects using shared.
        CounterWorker worker1 = new CounterWorker(shared);
        CounterWorker worker2 = new CounterWorker(shared);

        worker1.start();
        worker2.start();
        worker1.join();
        worker2.join();
        // Start both and join both; print final total.
        System.out.println("Total: " + shared.getValue());
    }
}
