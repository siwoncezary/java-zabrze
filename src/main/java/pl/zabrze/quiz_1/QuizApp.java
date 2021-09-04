package pl.zabrze.quiz_1;

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
        boolean isValidAnswer = 2 == option;
        boolean isOptionOutOfRange = 1 > option || 4 < option;
        System.out.println(isValidAnswer);
        System.out.println(isOptionOutOfRange);
        if (isValidAnswer) {
            System.out.println("Poprawna odpowiedź.");
        }
        else {
            //|| - operator logiczny lub - alternatywa
            if (isOptionOutOfRange) {
                System.out.println("Nieznany numer opcji.");
            } else {
                System.out.println("Błędna odpowiedź.");
            }
        }
    }
}
