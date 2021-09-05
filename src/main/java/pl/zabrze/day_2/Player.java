package pl.zabrze.day_2;

import java.time.LocalDate;

public class Player extends Person{
    static int counter;
    String nick = "Adam";
    int points;
    String emailAddress;

    public Player(String nick, int points, String emailAddress) {
        this();     //wywołanie konstruktora bezargumentowego
        this.nick = nick;
        this.points = points;
        this.emailAddress = emailAddress;
    }

    public Player(String nick, String emailAddress) {
        this();
        this.nick = nick;
        this.emailAddress = emailAddress;
    }

    public Player(String name, LocalDate birthDate, String nick, int points, String emailAddress) {
        super(name, birthDate);
        this.nick = nick;
        this.points = points;
        this.emailAddress = emailAddress;
    }

    Player(){
        counter++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", nick='" + nick + '\'' +
                ", points=" + points +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Usunięcie gracza");
    }
}
