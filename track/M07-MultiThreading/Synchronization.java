
class Printer implements Runnable {

    @Override
    synchronized public void run() {
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " using printer");
            Thread.sleep(2000);
            System.out.println(threadName + " still using the printer");
            Thread.sleep(2000);
            System.out.println(threadName + " stoped using printer");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Synchronization {

    public static void main(String[] args) {
        Printer p = new Printer();
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(p);
        t1.start();
        t2.start();
        t3.start();
        t1.setName("Java Dev");
        t2.setName("Python Dev");
        t3.setName("C Dev");
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
