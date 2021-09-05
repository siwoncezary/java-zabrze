package pl.zabrze.day_2;

import java.io.IOException;

public class PlayersApp {
    public static void main(String[] args) throws IOException {
        Player player = new Player("ooo", 23, "aa@za.pl");
        System.out.println(player);

        Player gracz = new Player();
        gracz.nick = "olo";
        gracz.points = 123;
        gracz.emailAddress = "olo@op.pl";
        System.out.println(gracz);
        System.out.println(Player.counter);
        Player kopiaGracza = gracz;
        gracz = null;
        System.gc();
        System.in.read();
    }
}
