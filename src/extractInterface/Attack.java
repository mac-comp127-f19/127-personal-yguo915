package extractInterface;

import java.util.Random;

public class Attack implements AttackInterface {
    private static final Random rand = new Random();
    private int swordMinDamage, swordMaxDamage, fireballDamage, fireballManaRequired;


    public Attack(int swordMinDamage, int swordMaxDamage, int fireballDamage, int fireballManaRequired){
        this.swordMinDamage = swordMinDamage;
        this.swordMaxDamage = swordMaxDamage;
        this.fireballDamage = fireballDamage;
        this.fireballManaRequired = fireballManaRequired;

    }

    public String attack(GameCharacter character, GameCharacter target) {
        if (fireballDamage > 0) {
            if (character.useMana(fireballManaRequired)) {
                target.takeDamage(fireballDamage);
                return character.getName() + " hit " + target.getName() + " with a fireball for "
                        + fireballDamage + " points of damage";
            } else {
                return character.getName() + " did not have enough mana for a fireball attack";
            }
        } else {
            int damage = rand.nextInt(swordMaxDamage - swordMinDamage + 1) + swordMinDamage;
            target.takeDamage(damage);
            return character.getName() + " struck " + target.getName() + " with a sword for "
                    + damage + " points of damage";
        }
    }


}
