package pl.zabrze.day_2.rpg;

public class DragonBattleApp {
    public static void main(String[] args) {
        Dragon fireDragon = new Dragon("ork", Elements.FIRE);
        Dragon earthDragon = new Dragon("xyz", Elements.EARTH);
        while(!fireDragon.isDeath() && !earthDragon.isDeath()){
            fireDragon.damage(earthDragon.attackElements());
            if (fireDragon.isDeath()){
                break;
            } else {
                earthDragon.damage(fireDragon.attackElements());
            }
        }
        if (fireDragon.isDeath()){
            System.out.println("Fire dragon losses!");
        }
        if (earthDragon.isDeath()){
            System.out.println("Earth dragon losses!");
        }
    }
}
