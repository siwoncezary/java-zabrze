package pl.zabrze.day_2;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println(10.0 / 0);
        } catch (ArithmeticException e){
            System.out.println("Sorry, nie dzielę przez zero!!!");
        }
        System.out.println("KONIEC");
    }
}
