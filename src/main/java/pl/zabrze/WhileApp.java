package pl.zabrze;

import java.util.Scanner;

public class WhileApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        System.out.println("Wpisz liczbę: ");
        if (scanner.hasNextInt()) {
            option = scanner.nextInt();
            System.out.println("Wpisałeś poprawnie liczbę " + option);
        } else {
            System.out.println("Wpisałeś niepoprawnie liczbę całkowitą!!!");
        }
        System.out.println("Wpisz liczbę całkowitą:");
        while(!scanner.hasNextInt()){
            System.out.println("Wpisałeś niepoprawnie liczbę. Wpisz jeszcze raz!");
            scanner.nextLine(); //usunięcie niepoprawnych danych
        }
        option = scanner.nextInt();
        System.out.println(option);
    }
}
