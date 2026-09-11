
import java.util.Scanner;

public class P08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String word = scanner.nextLine();

        // Create the reversed word and compare it.
        char[] charArr = word.toCharArray();
        char[] revArr = new char[(charArr.length)];
        int j = revArr.length - 1;
        for (int i = 0; i <= charArr.length - 1; i++) {
            revArr[j] = charArr[i];
            j--;
        }
        String reverseStr = new String(revArr);
        System.out.println("Reversed: " + reverseStr);
        if (word.equalsIgnoreCase(reverseStr)) {
            System.out.println("Palindrome: " + "true");
        } else {
            System.out.println("Palindrome: " + "false");
        }
    }
}
