package pl.zabrze.day_2.rpg;

public class Dragon extends Monster implements BattleElements{

    public Dragon(String name, Elements elements) {
        super(name, elements);
    }

    @Override
    public double attack() {
        return 0;
    }

    @Override
    public AttackElements attackElements() {
        AttackElements a = new AttackElements();
        a.attackPoints = 10 + random.nextInt(20);
        a.elements = elements;
        return a;
    }

    @Override
    public void damage(AttackElements attackElements) {
        if (attackElements.elements == this.elements){
            healthLevel -= attackElements.attackPoints / 2;
        } else {
            healthLevel -= attackElements.attackPoints * 1.5;
        }
    }

    @Override
    public void damage(double attackPoints) {

    }
}
