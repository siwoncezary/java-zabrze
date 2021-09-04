package pl.zabrze.quiz_3;

import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        int count = 5;
        //String[] questions = new String[count];
        String[] questions = {
                "Kiedy powstała Java?",
                "Pytanie 2",
                "Pytanie 3",
                "Pytanie 4",
                "Pytanie 5"
        };
        //String[][] options = new String[count][4];
        String[][] options = {
                {"1990", "1994", "2000","2004"},
                {"Opcja", "Opcja","Opcja","Opcja"},
                {"Opcja", "Opcja","Opcja","Opcja"},
                {"Opcja", "Opcja","Opcja","Opcja"},
                {"Opcja", "Opcja","Opcja","Opcja"}
        };
        int[] answers = {1, 0, 3, 2, 2};
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < count; i++) {
            //wyświetlenie polecenia i opcji dla każdego quizu
            System.out.println(questions[i]);
            for(int o = 0; o < options[i].length; o++){
                System.out.println((o + 1) + ". "+ options[i][o]);
            }
            int option = scanner.nextInt();
            if (option == answers[i]){
                System.out.println("Poprawna odpowiedź!");
            } else {
                System.out.println("Błędna odpowiedź");
            }
        }
    }
}
