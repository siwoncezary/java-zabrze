package pl.zabrze.day_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OpenTextFileApp {
    public static void main(String[] args) {
        Path pathTofile = Paths.get("c:\\data\\names.txt");
        try {
            List<String> lines = Files.readAllLines(pathTofile);
            List<String> names = new ArrayList<>();
            for(String line: lines){
                String[] split = line.split(",");
                for(String name: split){
                    names.add(name);
                }
            }
            System.out.println(names);
        } catch (IOException e) {
            System.out.println("Odczyt się nie powiódł!");
        }

    }
}
