package pl.zabrze.quiz_2;

import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiedy powstała Java?");
        System.out.println("1. 1990");
        System.out.println("2. 1994");
        System.out.println("3. 2000");
        System.out.println("4. 2006");
        System.out.println("Wpisz numer opcji: ");
        int option = scanner.nextInt();
        switch(option){
            case 1:
                System.out.println("Błędna odpowiedź");
                break;
            case 2:
                System.out.println("Poprawna odpowiedź");
                break;
            case 3:
                System.out.println("Błędna odpowiedź");
                break;
            case 4:
                System.out.println("Błędna odpowiedź");
                break;
            default:
                System.out.println("Nieznany numer opcji");
        }
        //inna postać tej samej instrukcji jak powyżej
        switch (option){
            default:
                System.out.println("Nieznany numer opcji");
                break;
            case 1:
            case 3:
            case 4:
                System.out.println("Błędna odpowiedź");
                break;
            case 2:
                System.out.println("Poprawna odpowiedź");
        }
    }
}
