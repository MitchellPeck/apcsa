package PookiemonGame.PookiemonClasses;

import PookiemonGame.Globals;
import PookiemonGame.Utils;

public class Pookiemon extends PookiemonType {
    private double critChance;
    private int speed;

    /**
     * Creates a new Pookiemon instance. Passes type and name to super constructor.
     *
     * @param types Types of the Pookiemon. Passed to super constructor.
     * @param name  Name of the Pookiemon. Passed to super constructor.
     */
    public Pookiemon(Types[] types, String name) {
        super(types, name);
        this.critChance = 0;
        this.speed = 1;
    }

    /**
     * Creates a new Pookiemon instance with given critChance. Passes type and name to super constructor.
     *
     * @param types Types of the Pookiemon. Passed to super constructor.
     * @param name  Name of the Pookiemon. Passed to super constructor.
     * @param speed Speed of the Pookiemon.
     */
    public Pookiemon(Types[] types, String name, int speed) {
        super(types, name);
        this.critChance = speed / 2.0;
        this.speed = speed;
    }

    /**
     * Creates a new Pookiemon instance with given critChance. Passes type and name to super constructor.
     *
     * @param types      Types of the Pookiemon. Passed to super constructor.
     * @param name       Name of the Pookiemon. Passed to super constructor.
     * @param critChance CritChance of the Pookiemon.
     * @param speed      Speed of the Pookiemon.
     */
    public Pookiemon(Types[] types, String name, double critChance, int speed) {
        super(types, name);
        this.critChance = critChance;
        this.speed = speed;
    }

    /**
     * Creates a new Pookiemon instance with given critChance. Passes type, name, and health to super constructor.
     *
     * @param types  Types of the Pookiemon. Passed to super constructor.
     * @param name   Name of the Pookiemon. Passed to super constructor.
     * @param speed  Speed of the Pookiemon.
     * @param health Health of the Pookiemon. Passed to super constructor.
     */
    public Pookiemon(Types[] types, String name, int speed, int health) {
        super(types, name, health);
        this.critChance = speed / 2.0;
        this.speed = speed;
    }

    /**
     * Creates a new Pookiemon instance with given critChance. Passes type, name, and health to super constructor.
     *
     * @param types      Types of the Pookiemon. Passed to super constructor.
     * @param name       Name of the Pookiemon. Passed to super constructor.
     * @param critChance CritChance of the Pookiemon.
     * @param speed      Speed of the Pookiemon.
     * @param health     Health of the Pookiemon. Passed to super constructor.
     */
    public Pookiemon(Types[] types, String name, double critChance, int speed, int health) {
        super(types, name, health);
        this.critChance = critChance;
        this.speed = speed;
    }

    /**
     * Creates a new Pookiemon instance with given critChance. Passes type, name, health, attack, and defense to super constructor.
     *
     * @param types   Types of the Pookiemon. Passed to super constructor.
     * @param name    Name of the Pookiemon. Passed to super constructor.
     * @param speed   Speed of the Pookiemon.
     * @param health  Health of the Pookiemon. Passed to super constructor.
     * @param attack  Attack strength of the Pookiemon. Passed to super constructor.
     * @param defense Defense strength of the Pookiemon. Passed to super constructor.
     */
    public Pookiemon(Types[] types, String name, int speed, int health, int attack, int defense) {
        super(types, name, health, attack, defense);
        this.critChance = speed / 2.0;
        this.speed = speed;
    }

    /**
     * Creates a new Pookiemon instance with given critChance. Passes type, moves, name, health, attack, defense, and evolution to super constructor.
     *
     * @param types     Types of the Pookiemon. Passed to super constructor.
     * @param name      Name of the Pookiemon. Passed to super constructor.
     * @param speed     Speed of the Pookiemon.
     * @param health    Health of the Pookiemon. Passed to super constructor.
     * @param attack    Attack strength of the Pookiemon. Passed to super constructor.
     * @param defense   Defense strength of the Pookiemon. Passed to super constructor.
     * @param evolution Pookiemon to evolve to. Passed to super constructor.
     */
    public Pookiemon(Types[] types, String name, int speed, int health, int attack, int defense, Pookiemon evolution) {
        super(types, name, health, attack, defense, evolution);
        this.speed = speed;
        this.critChance = speed /2.0;
    }

    /**
     * Creates a new Pookiemon instance with given critChance. Passes type, name, health, attack, and defense to super constructor.
     *
     * @param types      Types of the Pookiemon. Passed to super constructor.
     * @param name       Name of the Pookiemon. Passed to super constructor.
     * @param critChance CritChance of the Pookiemon.
     * @param speed      Speed of the Pookiemon.
     * @param health     Health of the Pookiemon. Passed to super constructor.
     * @param attack     Attack strength of the Pookiemon. Passed to super constructor.
     * @param defense    Defense strength of the Pookiemon. Passed to super constructor.
     */
    public Pookiemon(Types[] types, String name, double critChance, int speed, int health, int attack, int defense) {
        super(types, name, health, attack, defense);
        this.critChance = critChance;
        this.speed = speed;
    }

    /**
     * Get the crit chance of the Pookiemon.
     *
     * @return Crit chance of the Pookiemon.
     */
    public double getCritChance() {
        return critChance;
    }

    /**
     * Set the crit chance of the Pookiemon.
     *
     * @param critChance Crit chance of the Pookiemon.
     */
    public void setCritChance(double critChance) {
        this.critChance = critChance;
    }

    /**
     * Get the speed of the Pookiemon.
     *
     * @return Speed of the Pookiemon.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Set the speed of the Pookiemon.
     *
     * @param speed Speed of the Pookiemon.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Attack an enemy Pookiemon passed as a parameter.
     * Calls super attack method to get damage accounting for advantage over enemy PookiemonType.
     * Adjusts damage after checking for critical hit.
     *
     * @param enemy Enemy Pookiemon to attack.
     * @return Damage dealt to enemy Pookiemon, with advantage and criticality factored in.
     */
    public int attack(Pookiemon enemy, Move move) {
        boolean crit = getCrit();
        int typeDamage = super.attack(enemy, move);
        if (crit && typeDamage > 0) typeDamage *= 2;
        if (crit && typeDamage > 0) System.out.println(getName() + " has scored a critical hit! Damage doubled!");
        return Math.max((int) ((typeDamage * Globals.damageMultiplier) + .5), 0);
    }

    /**
     * Determines if a critical hit is made.
     *
     * @return Whether a critical hit is made.
     */
    private boolean getCrit() {
        return Utils.Random.number(1, 100) < critChance;
    }

    /**
     * Evolves current Pookiemon to represent evolution Pookiemon values.
     */
    @Override
    public void evolve() {
        if (getEvolution() == null) return;
        this.critChance = getEvolution().getCritChance();
        this.speed = getEvolution().getSpeed();
    }

    /**
     * Get the string representation of the Pookiemon and its health and critChance.
     *
     * @return The string representation of the Pookiemon and its health and critChance.
     */
    @Override
    public String toString() {
        return getTypes()[0] + " " + getName() + " with " + getHealth() + " health, " + getAttack() + " attack strength, and " + getDefense() + " defense strength. \n Speed is " + speed + " and the chance of making a critical hit against an opponent is " + Utils.getChance(critChance);
    }
}
