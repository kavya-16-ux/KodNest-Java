
import java.util.Scanner;

public class P17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        // Reverse the word, compare it and display the result.
        char[] ar = word.toCharArray();
        char[] ar1 = new char[ar.length];
        int j = ar1.length - 1;
        for (int i = 0; i <= ar.length - 1; i++) {
            ar1[j] = ar[i];
            j--;
        }
        String s = new String(ar1);
        if (word.equals(s)) {
            System.out.println("Palindrome: " + "true");
        } else {
            System.out.println("Palindrome: " + "false");
        }
    }
}
