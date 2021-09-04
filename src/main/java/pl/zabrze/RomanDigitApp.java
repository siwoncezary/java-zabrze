package pl.zabrze;

import java.util.Scanner;

/*
Napisz program, który wczytuje liczbę całkowitą od 1 do 5
i wyświetla jej odpowiednik rzymski
 */
public class RomanDigitApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        switch (digit){
            case 3:
                System.out.print("I");
            case 2:
                System.out.print("I");
            case 1:
                System.out.print("I");
                break;
            case 4:
                System.out.print("I");
            case 5:
                System.out.println("V");
        }
    }
}
