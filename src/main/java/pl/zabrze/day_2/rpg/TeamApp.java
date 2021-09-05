package pl.zabrze.day_2.rpg;

import java.util.*;

public class TeamApp {
    public static void main(String[] args) {
        System.out.println("********************* LISTY *********************************");
        List<BattleCharacter> team = new ArrayList<>();
        Brek brek = new Brek("Antoś");
        team.add(brek);
        team.add(new Troll("Adaś"));
        team.add(new Hero());
        System.out.println(team);
        team.remove(2);
        System.out.println(team);
        System.out.println("Liczba członków drużyny: " + team.size());
        for(BattleCharacter character: team){
            System.out.println(character);
        }

        System.out.println("Członek nr 1: " + team.get(0));
        System.out.println("Członek nr 2: " + team.get(1));
        System.out.println("Lista umożliwia dodanie wiele razy tego samego elementu.");
        team.add(brek);
        System.out.println(team);

        System.out.println("********************** ZBIORY ********************************");
        Set<String> names = new HashSet<>();
        names.add("Adam");
        names.add("Karol");
        names.add("Ewa");
        System.out.println(names);
        names.add("Karol");
        System.out.println(names);
        System.out.println("Czy do zbioru należy Ewa? " + names.contains("Ewa"));
        System.out.println("Czy do zbioru należy Roman? " + names.contains("Roman"));
        System.out.println("Iterowanie po zbiorze");
        for(String name: names){
            System.out.println(name);
        }
        System.out.println("*********************** MAPY *******************************");
        Map<String, BattleCharacter> characters = new HashMap<>();
        characters.put("antek", brek);
        characters.put("xyz", new Troll("XYX"));
        characters.put("hero", new Hero());
        System.out.println("Pobieranie z mapy");
        BattleCharacter char1 = characters.get("antek");
        BattleCharacter char2 = characters.get("xyz");
        BattleCharacter char3 = characters.get("adaś");
        System.out.println(char1);
        System.out.println(char2);
        System.out.println(char3);
        //typowy null check - testowanie czy istnieją oba obiekty pobrane z mapy
        if (char2 != null && char3 != null){
            //TODO walka postaci
        }

    }
}
