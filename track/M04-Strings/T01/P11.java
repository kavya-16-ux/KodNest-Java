
public class P11 {

    public static void main(String[] args) {
        String s1 = "Java";
        // String to array using toCharArray
        char[] ar = s1.toCharArray();
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
        // array back to string
        String s2 = new String(ar);
        System.out.println(s2);
    }
}
