package pl.zabrze.day_2.rpg;

public class Hero implements BattleCharacter{

    @Override
    public double attack() {
        return 10;
    }

    @Override
    public void damage(double attackPoints) {

    }

    @Override
    public boolean isDeath() {
        return false;
    }
}
