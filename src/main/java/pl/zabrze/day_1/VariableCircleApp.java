package main.java.pl.zabrze.day_1;

import java.util.Scanner;

public class VariableCircleApp {
    public static void main(String[] args) {
        int radiusInt       = 1000000000;
        long radiusLong     = 1000000000000000000L;
        short radiusShort   = 10000;
        byte radiusByte     = 100;

        double radiusDouble = 100.0;
        float radiusFloat = 100.0f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz promień koła:");
        radiusDouble = scanner.nextDouble();
        System.out.println("Pole powierzchni koła o promieniu " + radiusDouble);
        System.out.println(Math.pow(radiusDouble,2) * Math.PI);
    }
}
