package pl.zabrze.day_2.rpg;

public class RpgApp {
    public static void main(String[] args) {
        BattleCharacter monster = new Troll("Antoś");
        BattleCharacter hero = new Hero();
        while(!monster.isDeath() && !hero.isDeath()){
            monster.damage(hero.attack());
            double damagePoint = monster.attack();
            hero.damage(damagePoint);
            System.out.println("Monster attacks with: " + damagePoint);
        }
    }
}
