
import java.util.Scanner;

class Counter {

    private int value = 0;

    synchronized void increment() {
        value++;
    }

    synchronized int getValue() {
        return value;
    }
}

class CounterWorker extends Thread {

    private Counter counter;
    private int times;

    CounterWorker(Counter counter, int times) {
        this.counter = counter;
        this.times = times;
    }

    public void run() {
        // TODO: Call counter.increment() exactly 'times' times.
        for (int i = 0; i < times; i++) {
            counter.increment();
        }
    }
}

class P08 {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Counter shared = new Counter();

        // TODO: Create two CounterWorker objects using the SAME
        CounterWorker worker1 = new CounterWorker(shared, n);
        CounterWorker worker2 = new CounterWorker(shared, n);
        // shared Counter and n. Start and join both workers.
        worker1.start();
        worker2.start();
        worker1.join();
        worker2.join();
        // Finally print "Total: " + shared.getValue().
        System.out.println("Total: " + shared.getValue());
    }
}
