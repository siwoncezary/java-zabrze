package pl.zabrze.day_2.rpg;

public interface BattleElements {
    AttackElements attackElements();
    void damage(AttackElements attackElements);
    boolean isDeath();
}
