
class Demo {

    {
        System.out.println("1st non static block"); // while object created then 
        // jvm will check and execute the non static block
    }

    {
        System.out.println("2nd non static block");
    }

    static { //first static block will execute
        System.out.println("1st static block");
    }

    static {
        System.out.println("2nd static block");
    }
}

public class P04 {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
    }
}
