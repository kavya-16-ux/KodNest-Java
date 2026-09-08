
class P06 {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "JaVa";
        if (s1 == s2) {
            System.out.println("reference are equal");
        } else {
            System.out.println("reference are not equal");
        }
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }
    }
}
