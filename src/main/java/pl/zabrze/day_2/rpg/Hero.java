package pl.zabrze.day_2.rpg;

public class Hero implements Attack, Damage, Death{

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
