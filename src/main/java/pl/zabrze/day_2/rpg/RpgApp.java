package pl.zabrze.day_2.rpg;

public class RpgApp {
    public static void main(String[] args) {
        Brek brek = new Brek("Antoś");
        Hero hero = new Hero();
        while(!brek.isDeath()){
            brek.damage(hero.attack());
            double damagePoint = brek.attack();
            hero.damage(damagePoint);
            System.out.println("Brek attacks with: " + damagePoint);
            System.out.println("Brek health level: " + brek.healthLevel);
        }
    }
}
