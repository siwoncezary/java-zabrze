package main.java.pl.zabrze.day_1;

public class LogicApp {
    public static void main(String[] args) {
        //Operator koniunkcji - and - i - &&
        //czy zmiennna jest miedzy 1 i 4 włącznie
        int option = 3;
        if (option > 0 && option < 5){
            System.out.println("W zakresie od 1 do 4");
        } else {
            System.out.println("Poza zakresem");
        }
        //to samo z użyciem operatorów mniejsze równe i większe równe
        if (option >= 1 && option <= 4){
            System.out.println("W zakresie od 1 do 4");
        } else {
            System.out.println("Poza zakresem");
        }
        //operator różne - !=
        //czy zmienna jest różna od 2
        if (option != 2){
            System.out.println("Różna od 2");
        } else {
            System.out.println("Równa 2");
        }
        /*
        Operatory relacji zwracające wartość logiczną:
        >
        <
        >=
        <=
        ==
        !=
        Operatory logiczne operujące na wartościach logicznych:
        || - lub
        && - i
        ! - negacja
         */
    }
}
