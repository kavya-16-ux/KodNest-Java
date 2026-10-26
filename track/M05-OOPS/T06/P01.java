
class OS {

    OS() {
        System.out.println("OS constructor");
    }

    void checkOS() {
        System.out.println("Check os function");
    }
}

class Mobile {

    OS o = new OS();

    Mobile() {
        System.out.println("Mobile constructor");
    }
}

class P01 {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.o.checkOS();
        //if mobile object died then the os also died which means cant able to use
        // m=null;
        //m.o.checkOS(); not possible to fetch the data
    }
}
