package pl.zabrze.day_2.rpg;

public class Troll extends Monster implements BattleCharacter{

    public Troll(String name) {
        super(name);
    }

    @Override
    public double attack() {
        if (healthLevel > 50){
            return 20 + random.nextInt(10);
        } else {
            return 10 + random.nextInt(5);
        }
    }

    @Override
    public void damage(double attackPoints) {
        if (healthLevel > 50){
            healthLevel -= attackPoints / 2;
        } else {
            healthLevel -= attackPoints;
        }
    }
}
