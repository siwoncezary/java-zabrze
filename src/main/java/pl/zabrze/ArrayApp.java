package pl.zabrze;

public class ArrayApp {
    public static void main(String[] args) {
        int[] points = new int[10];
        for(int i = 0; i < points.length; i++){
            points[i] = (int) (Math.random() * 100);
        }
        for(int i = 0; i < points.length; i++){
            System.out.println("Gracz o id " + i + " ma puntków: " + points[i]);
        }
        int sum = 0;
        for(int i = 0; i < points.length; i++) {
            sum = sum + points[i];
            System.out.println(sum);
        }
        System.out.println("Srednia punktów: " + sum * 1.0 / points.length);
    }
}
