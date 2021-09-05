package pl.zabrze.day_2;

public class SquareApp {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("Pole kwadratu: " + s.area());
        System.out.println("Obwód kwadratu: " + s.perimeter());
        System.out.println("Cena płytki: " + s.price(5));
        System.out.println(s);
    }
}
