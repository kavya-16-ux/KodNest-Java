
public class P06 {

    public static void main(String[] args) {
        String s = "Java";
        char[] sb = s.toCharArray();
        char[] ar = new char[4];
        int j = sb.length - 1;

        for (int i = 0; i <= sb.length - 1; i++) {
            ar[j] = sb[i];
            j--;
        }
        String rev = new String(ar);
        System.out.println(s);
        System.out.println(ar);

    }
}
