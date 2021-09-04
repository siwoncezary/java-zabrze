package main.java.pl.zabrze.day_1;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Długość promienia: 12.4");
        System.out.print("Pole powierzchni: ");
        System.out.println(12.4 * 12.4 * 3.14);
        System.out.println("Obwód koła:");
        System.out.println(2 * 3.14 * 12.4);
        System.out.print("Dla pola 100 promień wynosi: ");
        System.out.println(Math.sqrt(100/3.14));
        System.out.println(100/3);
        System.out.println(100 % 3);
        System.out.println(100/3.0);
        System.out.println("Obliczenie pola powierzchni z użyciem Math");
        System.out.println(Math.pow(12.4, 2) * Math.PI);
    }
}
