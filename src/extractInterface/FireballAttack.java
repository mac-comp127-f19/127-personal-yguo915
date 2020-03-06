package extractInterface;

public class FireballAttack implements AttackInterface {
    private final int damage, manaRequired;

    public FireballAttack(int damage, int manaRequired) {
        this.damage = damage;
        this.manaRequired = manaRequired;
    }

    public String attack(GameCharacter character, GameCharacter target){
        if (character.useMana(manaRequired)) {
            target.takeDamage(damage);
            return character.getName() + " hit " + target.getName() + " with a fireball for " + damage + " points of damage";
        } else {
            return character.getName() + " did not have enough mana for a fireball attack";
        }
    }
}
