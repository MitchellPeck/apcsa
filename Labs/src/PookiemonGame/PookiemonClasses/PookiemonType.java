package PookiemonGame.PookiemonClasses;

import PookiemonGame.Utils;

import java.util.*;

public class PookiemonType extends PookiemonBase {
    private Types[] types;
    private Map<Types, Double> advantages = new HashMap<>();
    private ArrayList<Types> immunities = new ArrayList<>();

    /**
     * Creates a new PookiemonType instance with given types. Passes name to super constructor.
     *
     * @param types Types of the Pookiemon.
     * @param name  Name of the Pookiemon. Passed to super constructor.
     */
    public PookiemonType(Types[] types, String name) {
        super(name);
        this.types = types;
    }

    /**
     * Creates a new PookiemonType instance with given types. Passes name and health to super constructor.
     *
     * @param types  Types of the Pookiemon.
     * @param name   Name of the Pookiemon. Passed to super constructor.
     * @param health Health of the Pookiemon. Passed to super constructor.
     */
    public PookiemonType(Types[] types, String name, int health) {
        super(name, health);
        this.types = types;
    }

    /**
     * Creates a new PookiemonType instance with given types. Passes name, health, attack, and defense to super constructor.
     *
     * @param types   Types of the Pookiemon.
     * @param name    Name of the Pookiemon. Passed to super constructor.
     * @param health  Health of the Pookiemon. Passed to super constructor.
     * @param attack  Attack strength of the Pookiemon. Passed to super constructor.
     * @param defense Defense strength of the Pookiemon. Passed to super constructor.
     */
    public PookiemonType(Types[] types, String name, int health, int attack, int defense) {
        super(name, health, attack, defense);
        this.types = types;
    }

    /**
     * Creates a new PookiemonType instance with given types and moves. Passes name, health, attack, defense, and evolution to super constructor.
     *
     * @param types     Types of the Pookiemon.
     * @param name      Name of the Pookiemon. Passed to super constructor.
     * @param health    Health of the Pookiemon. Passed to super constructor.
     * @param attack    Attack strength of the Pookiemon. Passed to super constructor.
     * @param defense   Defense strength of the Pookiemon. Passed to super constructor.
     * @param evolution Pookiemon to evolve to. Passed to super constructor.
     */
    public PookiemonType(Types[] types, String name, int health, int attack, int defense, Pookiemon evolution) {
        super(name, health, attack, defense, evolution);
        this.types = types;
    }

    /**
     * Get the types of the PookiemonType.
     *
     * @return Types of the PookiemonType.
     */
    public Types[] getTypes() {
        return types;
    }

    /**
     * Set the primary PookiemonType type.
     *
     * @param type Type to set as the primary PookiemonType type.
     */
    public void setPrimaryType(Types type) {
        this.types[0] = type;
    }

    /**
     * Set the secondary PookiemonType type.
     *
     * @param type Type to set as the secondary PookiemonType type.
     */
    public void setSecondaryType(Types type) {
        this.types[1] = type;
    }

    /**
     * Get the advantages that this PookiemonType has over other PookiemonTypes.
     *
     * @return Advantages that this PookiemonType has over other PookiemonTypes.
     */
    public Map<Types, Double> getAdvantages() {
        return advantages;
    }

    /**
     * Add an advantage that this PookiemonType has over other PookiemonTypes.
     *
     * @param type      The PookiemonType that the advantage is over.
     * @param advantage The advantage over the other PookiemonType.
     */
    public void setAdvantage(Types type, double advantage) {
        advantages.put(type, advantage);
    }

    /**
     * Add a disadvantage that this PookiemonType has over other PookiemonTypes.
     *
     * @param type         The PookiemonType that the disadvantage is under.
     * @param disadvantage The disadvantage under the other PookiemonType.
     */
    public void setDisadvantage(Types type, double disadvantage) {
        advantages.put(type, 1 / disadvantage);
    }

    /**
     * Add an immunity that this PookiemonType has for other PookiemonTypes.
     *
     * @param type The PookiemonType that the immunity is for.
     */
    public void setImmunity(Types type) {
        if (immunities.contains(type)) return;
        immunities.add(type);
    }

    /**
     * Check if this PookiemonType is immune to the given PookiemonType.
     * @param enemy The PookiemonType to check for an immunity against.
     * @return Whether this PookiemonType is immune to the given PookiemonType.
     */
    public boolean isImmune(PookiemonType enemy) {
        return immunities.contains(enemy.getTypes()[0]);
    }

    /**
     * Get the advantage that this PookiemonType has over another PookiemonType.
     *
     * @param enemy The PookiemonType that the advantage needs to be found for.
     * @return The advantage over the other PookiemonType.
     */
    public double advantage(PookiemonType enemy) {
        Types enemyType = enemy.getTypes()[0];
        double advantage = advantages.get(enemyType);
        if (advantage == 0) advantage = 1;
        return advantage;
    }

    /**
     * Attack an enemy PookiemonType passed as a parameter.
     * Calls super attack method to get damage.
     * Adjusts damage based on advantage over enemy PookiemonType, as well as chosen Move damage multiplier and accuracy.
     * If enemy PookiemonType is immune to this PookiemonType, returned attack is 0.
     *
     * @param enemy Enemy PookiemonType to attack.
     * @param move  Move to attack enemy PookiemonType with.
     * @return Damage dealt to enemy PookiemonType, with advantage factored in.
     */
    public int attack(PookiemonType enemy, Move move) {
        int baseDamage = super.attack(enemy);
        double advantage = advantage(enemy);
        if (advantage == 0) advantage = 1;
        int advantageDamage = (int) ((baseDamage * advantage) + .5);
        double damageMultiplier = move.getDamageMultiplier();
        double accuracy = move.getAccuracy();
        double accuracyChance = Utils.Random.number();
        int damage = 0;
        if (accuracyChance <= accuracy && !enemy.isImmune(this)) {
            damage = (int) ((advantageDamage * damageMultiplier) + .5);
        }
        return damage;
    }

    /**
     * Evolves current PookiemonType to represent evolution PookiemonType values.
     */
    @Override
    public void evolve() {
        if (getEvolution() == null) return;
        this.types = getEvolution().getTypes();
        this.advantages = getEvolution().getAdvantages();
        super.evolve();
    }

    /**
     * Get the string representation of the Pookiemon and its type.
     *
     * @return The string representation of the Pookiemon and its type.
     */
    @Override
    public String toString() {
        return types + " " + super.toString();
    }
}
