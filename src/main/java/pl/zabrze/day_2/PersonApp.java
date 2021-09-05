package pl.zabrze.day_2;

import java.time.LocalDate;

public class PersonApp {
    public static void main(String[] args) {
        Player player = new Player(
                "Adam",
                LocalDate.of(2000,10,10),
                "adamo",
                123,
                "adas@op.pl"
        );
        Person[] persons = new Person[3];
        persons[0] = player;
        persons[1] = new Person("Karol", LocalDate.of(1999,11,23));
        persons[2] = new Worker();
        for(Person p: persons){
            System.out.println(p.toString());
        }
    }
}
