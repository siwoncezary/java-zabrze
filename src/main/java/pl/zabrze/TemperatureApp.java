package pl.zabrze;

import java.util.Scanner;

/*
    jeśli temperatura powyżej 24 -> plaża
    jeśli od 10 do 24 -> spacer
    jeśli poniżej 10 -> dom
 */
public class TemperatureApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę: ");
        double temp = scanner.nextDouble();
        if (temp > 24){
            System.out.println("plaża");
        } else if (temp <= 24 && temp >= 10){
            System.out.println("spacer");
        } else {
            System.out.println("dom");
        }

    }
}
