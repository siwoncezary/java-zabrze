package pl.zabrze.day_2.rpg;

public class BrekApp {
    public static void main(String[] args) {
        Brek brek = new Brek("XYZ");
        BattleCharacter monster = brek;
        BattleCharacter hero = new Hero();
        int count = 1;
        while(!monster.isDeath() && !hero.isDeath()){
            if (count == 1) {
                brek.spray();
                count--;
            }
            monster.damage(hero.attack());
            double damagePoint = monster.attack();
            hero.damage(damagePoint);
            System.out.println("Monster attacks with: " + damagePoint);
        }
    }
}
