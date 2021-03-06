package pl.zabrze.day_2.rpg;

public class Brek extends Monster{
    private final static String weakness = "Spray";
    private final static int MAX_HEALTH_LEVEL = 200;
    private boolean isWeaknessActive;
    private int maxDamage;
    private int minDamage;
    private int roundCounter = 0;

    public Brek(String name) {
        super(name);
        this.maxDamage = 80 + random.nextInt(20);
        this.minDamage = 50 + random.nextInt(10);
    }

    @Override
    public double attack() {
        if (isWeaknessActive) {
            roundCounter--;
            if (roundCounter == 0){
                isWeaknessActive = false;
            }
            return 0;
        } else {
            return minDamage + random.nextInt(maxDamage - minDamage);
        }
    }

    @Override
    public void damage(double attackPoints) {
        if (isWeaknessActive) {
            this.healthLevel -= 2 * attackPoints;
        } else {
            this.healthLevel -= attackPoints * 0.8;
        }
    }

    public void spray(){
        if (roundCounter == 0) {
            roundCounter = 2;
            isWeaknessActive = true;
        }
    }
}
