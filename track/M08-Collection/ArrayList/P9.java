
import java.util.ArrayList;
import java.util.Scanner;

class P9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            numbers.add(sc.nextInt());
        }
        int value = sc.nextInt();
        // TODO: remove the first occurrence of value, not index value
        numbers.remove(Integer.valueOf(value));
        // TODO: print the remaining numbers
        System.out.println(numbers);
    }
}
