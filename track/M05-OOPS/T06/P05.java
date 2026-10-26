
import java.util.Scanner;

class Heart {

    private int beatsPerMinute;

    Heart(int beatsPerMinute) {

        this.beatsPerMinute = beatsPerMinute;
    }

    void beatFor(String personName) {

        System.out.println("Heart is beating at " + beatsPerMinute + " BPM for " + personName);
    }
}

class Person {

    private String name;

    Person(String name) {

        this.name = name;
    }

    void liveWith(Heart heart) {

        heart.beatFor(name);
    }
}

public class P05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the person name");
        String personName = scanner.nextLine();
        System.out.println("Enter the bpm of the person");
        int bpm = scanner.nextInt();

        Heart heart = new Heart(bpm);
        Person person = new Person(personName);
        person.liveWith(heart);

    }
}
