package main.java.pl.zabrze.day_1;

import java.util.Scanner;

public class StringApp {
    public static void main(String[] args) {
        //zmienna łańcuchowa - składa się z ciagu znaków typu char
        String name = "Karol";
        //zmienna znakowa
        char sign = 'A';
        char letter = 100;
        //do zmiennej całkowite można przypisać kod ASCII znaku
        int a = 'a';
        System.out.println("******");
        System.out.println(sign);       //zostanie wydrukowany znak A
        System.out.println(letter);     //zostanie wydrukowany znak d - kod ASCII 100
        System.out.println(a);          //zostanie wydrukowana liczba 97 - jako kod ASCII znaku a
        System.out.println("******");
        System.out.println("Imię przed: " + name);
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();          //do zmiennej łańcuchowej można przypisać inny łańcuch
        System.out.println("Imię po: " + name);
        letter = name.charAt(0);
        System.out.println(letter);     //odwołanie do znaku o podanym indeksie
        //Wycięcie z łańcucha nazwy użytkownika
        String emailAddress = "karol@op.pl";
        int gdzieJestMałpa = emailAddress.indexOf('@');
        System.out.println("Index małpy: " + gdzieJestMałpa);
        String userName = emailAddress.substring(0, gdzieJestMałpa);
        System.out.println(userName);
        String[] names = new String[5];
        names[2] = name;
        //pętla foreach
        //w komórkach o indeksach 0, 1, 3, 4 brak łańcuchów i zostaną wyświetlone null'e
        for(String n: names){
            System.out.println(n);
        }
        //długość łańcucha
        System.out.println("Długość imienia: " + name.length());
    }
}
