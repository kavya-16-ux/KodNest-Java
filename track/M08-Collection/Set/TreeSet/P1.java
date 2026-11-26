
import java.util.*;

public class P1 {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(25);
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        // ts.add(null); null pointer exception
        System.out.println(ts); //[25, 50, 75, 100, 125, 150, 175]

        //built-in method
        //headSet and tailSet
        System.out.println(ts.headSet(75));//[25, 50]
        System.out.println(ts.headSet(75, true));//[25, 50, 75]
        System.out.println(ts.tailSet(100));//[100, 125, 150, 175]
        System.out.println(ts.tailSet(100, false));//[125, 150, 175]

        //higher
        System.out.println(ts.higher(100));//125
        System.out.println(ts.higher(80));//100
        System.out.println(ts.higher(200));//null
        System.out.println(ts.higher(0));//25

        //lower
        System.out.println(ts.lower(100));//75
        System.out.println(ts.lower(30));//25
        System.out.println(ts.lower(10));//null

        //ceiling
        System.out.println(ts.ceiling(100));//100
        System.out.println(ts.ceiling(80));//100
        System.out.println(ts.ceiling(200));//null

        //floor
        System.out.println(ts.floor(125));//125
        System.out.println(ts.floor(70));//50
        System.out.println(ts.floor(20));//null
    }
}
