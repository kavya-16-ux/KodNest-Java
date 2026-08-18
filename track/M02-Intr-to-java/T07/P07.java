
public class P07 {

    public static void main(String[] args) {
        // Write your code here.
        int[] readings = {12, 14, 16, 18};
        int updateIndex = 2;
        int newValue = 25;
        int[] snapShot = new int[readings.length];
        for (int i = 0; i <= readings.length - 1; i++) {
            snapShot[i] = readings[i];
        }
        readings[updateIndex] = newValue;
        System.out.print("Snapshot: ");
        for (int i = 0; i <= snapShot.length - 1; i++) {
            System.out.print(snapShot[i] + " ");
        }
        System.out.println();
        System.out.print("Updated: ");
        for (int i = 0; i <= readings.length - 1; i++) {
            System.out.print(readings[i] + " ");
        }
    }
}
