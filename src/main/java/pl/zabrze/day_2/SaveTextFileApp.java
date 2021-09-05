package pl.zabrze.day_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SaveTextFileApp {
    public static void main(String[] args) {
        Path pathToFile = Paths.get("c:\\data\\names.txt");
        String names = "Ala, Ola, Ela, Ewa, Adam";
        try {
            Files.writeString(pathToFile, names, StandardOpenOption.CREATE);
        } catch (IOException e) {
            System.out.println("Zapis nie powiódł się!");
        }
    }
}
