
class Hospital implements Runnable {

    String res1 = "Doctor";
    String res2 = "Bed";

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("Tom")) {
            tomTreat();
        } else {
            jerryTreat();
        }
    }

    void tomTreat() {
        try {
            synchronized (res1) {
                System.out.println("Tom has occupied " + res1);
                Thread.sleep(2000);
                synchronized (res2) {
                    System.out.println("Tom has occupied " + res2);
                    Thread.sleep(2000);
                }
                System.out.println("Tom has released " + res2);
            }
            System.out.println("Tom has released " + res1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void jerryTreat() {
        try {
            synchronized (res2) {
                System.out.println("Jerry has occupied " + res2);
                Thread.sleep(2000);
                synchronized (res1) {
                    System.out.println("Jerry has occupied " + res1);
                    Thread.sleep(2000);
                }
                System.out.println("Jerry has released " + res1);
            }
            System.out.println("Jerry has released " + res2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Deadlock {

    public static void main(String[] args) {
        Hospital h = new Hospital();
        Thread t1 = new Thread(h);
        Thread t2 = new Thread(h);

        t1.setName("Tom");
        t2.setName("Jerry");
        t1.start();
        t2.start();
    }
}
