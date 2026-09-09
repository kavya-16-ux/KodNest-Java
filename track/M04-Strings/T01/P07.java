
public class P07 {

    public static void main(String[] args) {
        String s1 = "KodNest Technologies";
        String s2 = " Java ";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(3));
        System.out.println(s1.contains("Nest"));
        System.out.println(s1.contains("nest"));
        System.out.println(s1.startsWith("Kod"));
        System.out.println(s1.endsWith("ies"));
        System.out.println(s1.indexOf('e'));//first e index
        System.out.println(s1.length());
        System.out.println(s1.substring(5));//from index 5 to end
        System.out.println(s1.substring(5, 14));//from index 5 to 13
        System.out.println(s1.replace('K', 'E'));
        System.out.println(s2.trim());//java with no space in both before and after

    }
}
