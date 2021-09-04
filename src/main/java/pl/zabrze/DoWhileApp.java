package pl.zabrze;

import java.util.Scanner;

public class DoWhileApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            if(scanner.hasNextInt()){
                break;
            } else {
                System.out.println("Wpisz poprawnie liczbę jeszcze raz!");
                scanner.nextLine();
            }
        } while(true);
        int option = scanner.nextInt();
        System.out.println("Wpisałeś opcję nr " + option);
    }
}
