package PokemonGame.PokemonClasses;

import PokemonGame.Globals;
import PokemonGame.Utils;

public class Pokemon extends PokemonType {
    private double critChance;
    private int speed;

    /**
     * Creates a new Pokemon instance. Passes type and name to super constructor.
     *
     * @param type Type of the Pokemon. Passed to super constructor.
     * @param name Name of the Pokemon. Passed to super constructor.
     */
    public Pokemon(Types type, String name) {
        super(type, name);
        this.critChance = 0;
        this.speed = 1;
    }

    /**
     * Creates a new Pokemon instance with given critChance. Passes type and name to super constructor.
     *
     * @param type  Type of the Pokemon. Passed to super constructor.
     * @param name  Name of the Pokemon. Passed to super constructor.
     * @param speed Speed of the Pokemon.
     */
    public Pokemon(Types type, String name, int speed) {
        super(type, name);
        this.critChance = speed / 2.0;
        this.speed = speed;
    }

    /**
     * Creates a new Pokemon instance with given critChance. Passes type and name to super constructor.
     *
     * @param type       Type of the Pokemon. Passed to super constructor.
     * @param name       Name of the Pokemon. Passed to super constructor.
     * @param critChance CritChance of the Pokemon.
     * @param speed      Speed of the Pokemon.
     */
    public Pokemon(Types type, String name, double critChance, int speed) {
        super(type, name);
        this.critChance = critChance;
        this.speed = speed;
    }

    /**
     * Creates a new Pokemon instance with given critChance. Passes type, name, and health to super constructor.
     *
     * @param type   Type of the Pokemon. Passed to super constructor.
     * @param name   Name of the Pokemon. Passed to super constructor.
     * @param speed  Speed of the Pokemon.
     * @param health Health of the Pokemon. Passed to super constructor.
     */
    public Pokemon(Types type, String name, int speed, int health) {
        super(type, name, health);
        this.critChance = speed / 2.0;
        this.speed = speed;
    }

    /**
     * Creates a new Pokemon instance with given critChance. Passes type, name, and health to super constructor.
     *
     * @param type       Type of the Pokemon. Passed to super constructor.
     * @param name       Name of the Pokemon. Passed to super constructor.
     * @param critChance CritChance of the Pokemon.
     * @param speed      Speed of the Pokemon.
     * @param health     Health of the Pokemon. Passed to super constructor.
     */
    public Pokemon(Types type, String name, double critChance, int speed, int health) {
        super(type, name, health);
        this.critChance = critChance;
        this.speed = speed;
    }

    /**
     * Creates a new Pokemon instance with given critChance. Passes type, name, health, attack, and defense to super constructor.
     *
     * @param type    Type of the Pokemon. Passed to super constructor.
     * @param name    Name of the Pokemon. Passed to super constructor.
     * @param speed   Speed of the Pokemon.
     * @param health  Health of the Pokemon. Passed to super constructor.
     * @param attack  Attack strength of the Pokemon. Passed to super constructor.
     * @param defense Defense strength of the Pokemon. Passed to super constructor.
     */
    public Pokemon(Types type, String name, int speed, int health, int attack, int defense) {
        super(type, name, health, attack, defense);
        this.critChance = speed / 2.0;
        this.speed = speed;
    }

    /**
     * Creates a new Pokemon instance with given critChance. Passes type, name, health, attack, and defense to super constructor.
     *
     * @param type       Type of the Pokemon. Passed to super constructor.
     * @param name       Name of the Pokemon. Passed to super constructor.
     * @param critChance CritChance of the Pokemon.
     * @param speed      Speed of the Pokemon.
     * @param health     Health of the Pokemon. Passed to super constructor.
     * @param attack     Attack strength of the Pokemon. Passed to super constructor.
     * @param defense    Defense strength of the Pokemon. Passed to super constructor.
     */
    public Pokemon(Types type, String name, double critChance, int speed, int health, int attack, int defense) {
        super(type, name, health, attack, defense);
        this.critChance = critChance;
        this.speed = speed;
    }

    /**
     * Get the crit chance of the Pokemon.
     *
     * @return Crit chance of the Pokemon.
     */
    public double getCritChance() {
        return critChance;
    }

    /**
     * Set the crit chance of the Pokemon.
     *
     * @param critChance Crit chance of the Pokemon.
     */
    public void setCritChance(double critChance) {
        this.critChance = critChance;
    }

    /**
     * Get the speed of the Pokemon.
     *
     * @return Speed of the Pokemon.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Set the speed of the Pokemon.
     *
     * @param speed Speed of the Pokemon.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Attack an enemy Pokemon passed as a parameter.
     * Calls super attack method to get damage accounting for advantage over enemy PokemonType.
     * Adjusts damage after checking for critical hit.
     *
     * @param enemy Enemy Pokemon to attack.
     * @return Damage dealt to enemy Pokemon, with advantage and criticality factored in.
     */
    public int attack(Pokemon enemy, Move move) {
        boolean crit = getCrit();
        int typeDamage = super.attack(enemy, move);
        if (crit && typeDamage > 0) typeDamage *= 2;
        if (typeDamage > 0) System.out.println(getName() + " has scored a critical hit! Damage doubled!");
        return (int)((typeDamage * Globals.damageMultiplier) + .5);
    }

    /**
     * Determines if a critical hit is made.
     *
     * @return Whether a critical hit is made.
     */
    private boolean getCrit() {
        return Utils.Random.bool();
    }
}
