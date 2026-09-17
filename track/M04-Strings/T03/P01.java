
class Car {

    static void convertKmtoMile() { //object not required to calculate example bike
        System.out.println("Convert the km to mile");
    }

    void milageCalculator() {
        System.out.println("Converting");
    }
}

public class P01 {

    public static void main(String[] args) {

        Car.convertKmtoMile(); //static so dont need to create object
        Car c = new Car(); //object created
        c.milageCalculator(); //non static so need to create object

    }
}
