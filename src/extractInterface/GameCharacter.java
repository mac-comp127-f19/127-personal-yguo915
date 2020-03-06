package extractInterface;

import java.util.Random;

public class GameCharacter {
    private static final Random rand = new Random();

    private final String name;
    private int hitPoints, mana;
    private final AttackInterface attack;

    public GameCharacter(String name, int hitPoints, int mana, AttackInterface attack) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.mana = mana;
        this.attack = attack;

    }

    public String attack(GameCharacter target) {
        return attack.attack(this, target);
    }


    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getMana() {
        return mana;
    }

    public void takeDamage(int damage) {
        hitPoints = Math.max(0, hitPoints - damage);
    }

    public boolean useMana(int amount) {
        if (mana >= amount) {
            mana -= amount;
            return true;
        } else {
            return false;
        }
    }
}
