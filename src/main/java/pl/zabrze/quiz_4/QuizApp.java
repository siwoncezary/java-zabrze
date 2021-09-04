package pl.zabrze.quiz_4;

import main.java.pl.zabrze.day_1.Quiz;

import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Quiz[] quizzes = new Quiz[3];
        Scanner scanner = new Scanner(System.in);

        Quiz quiz1 = new Quiz();
        quiz1.question = "Kiedy powstała Java?";
        quiz1.options = new String[]{"1990", "1994", "2000", "2004"};
        quiz1.validOption = 1;
        quizzes[0] = quiz1;

        quiz1 = new Quiz();
        quiz1.question = "Które słowo tworzy obiekt?";
        quiz1.options = new String[]{"for", "float", "new", "while"};
        quiz1.validOption = 2;
        quizzes[1] = quiz1;

        quiz1 = new Quiz();
        quiz1.question = "Instrukcja iteracyjna to?";
        quiz1.options = new String[]{"int", "if", "new", "while"};
        quiz1.validOption = 3;
        quizzes[2] = quiz1;

        for (Quiz quiz: quizzes){
            System.out.println(quiz.question);
            int count = 0;
            for(String option: quiz.options){
                System.out.println(++count +". " + option);
            }
            //TODO
            int answer = scanner.nextInt();
            if (quiz.validOption == answer - 1){
                System.out.println("Poprawna");
            } else{
                System.out.println("Błędna");
            }
        }

    }
}
