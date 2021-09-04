package pl.zabrze;

import java.util.Scanner;

public class ForApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbę powtórzeń:");
        int count = scanner.nextInt();
        for(int i = count; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println("********");
        for (int i = count; true; --i){
            System.out.println(i);
            if (i == 0){
                break;
            }
        }
    }
}
