
import java.util.Arrays;
import java.util.Scanner;

public class P18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine().toLowerCase();
        String second = scanner.nextLine().toLowerCase();

        // Match and remove characters, then display the result.
        if (first.length() != second.length()) {
            System.out.println("Anagram: " + "false");
            return;
        }
        char[] ar1 = first.toCharArray();
        char[] ar2 = second.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        String s1 = new String(ar1);
        String s2 = new String(ar2);
        if (s1.equals(s2)) {
            System.out.println("Anagram: " + "true");
        } else {
            System.out.println("Anagram: " + "false");
        }

    }
}
