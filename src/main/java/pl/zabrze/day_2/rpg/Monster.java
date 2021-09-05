package pl.zabrze.day_2.rpg;

import java.util.Random;

abstract public class Monster implements BattleCharacter{
    public final static Random random = new Random();
    protected int healthLevel;
    private String name;
    protected int experience;

    public Monster(String name) {
        this.name = name;
        healthLevel = 100;
        experience = 0;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public boolean isDeath() {
        return healthLevel <= 0;
    }
}
