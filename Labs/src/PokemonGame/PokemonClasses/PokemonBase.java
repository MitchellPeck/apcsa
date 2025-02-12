package PokemonGame.PokemonClasses;

public class PokemonBase {
    private String name;
    private int health;
    private int attack;
    private int defense;
    private int battleDamage;

    /**
     * Creates a new PokemonBase instance with given name and default health, attack, and defense.
     *
     * @param name Name of the Pokemon.
     */
    public PokemonBase(String name) {
        this.name = name;
        this.health = 10;
        this.attack = 2;
        this.defense = 2;
    }

    /**
     * Creates a new PokemonBase instance with given name and health and default attack and defense.
     *
     * @param name   Name of the Pokemon.
     * @param health Starting health of the Pokemon.
     */
    public PokemonBase(String name, int health) {
        this.name = name;
        this.health = health;
        this.attack = 2;
        this.defense = 2;
    }

    /**
     * Creates a new PokemonBase instance with given name, health, attack, and defense.
     *
     * @param name    Name of the Pokemon.
     * @param health  Starting health of the Pokemon.
     * @param attack  Attack strength of the Pokemon.
     * @param defense Defense strength of the Pokemon.
     */
    public PokemonBase(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    /**
     * Get the name of the Pokemon.
     *
     * @return Name of the Pokemon.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the Pokemon.
     *
     * @param name Name of the Pokemon.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the health of the Pokemon.
     *
     * @return Health of the Pokemon.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Set the health of the Pokemon.
     *
     * @param health Health of the Pokemon.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Get the attack strength of the Pokemon.
     *
     * @return Attack strength of the Pokemon.
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Set the attack strength of the Pokemon.
     *
     * @param attack Attack strength of the Pokemon.
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * Get the defense strength of the Pokemon.
     *
     * @return Defense strength of the Pokemon.
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Set the defense strength of the Pokemon.
     *
     * @param defense Defense strength of the Pokemon.
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * Attack an enemy PokemonBase passed as a parameter.
     * Damage is random number between 1 and the difference between this Pokemon Base's attack strength and the enemy Pokemon Base's defense strength.
     *
     * @param enemy Enemy Pokemon to attack.
     * @return Damage dealt to enemy Pokemon.
     */
    public int attack(PokemonBase enemy) {
        int enemyDefense = enemy.getDefense();
        int attackDifference = attack - enemyDefense;
        int damage = (int) (Math.random() * attackDifference + 1);
        return damage;
    }

    /**
     * Adjusts health based on given damage value. Health minimum is 0.
     * Stores dealt damage in battleDamage variable for use in heal() method.
     * If health is 0 after damage, alert that this Pokemon is down.
     * Otherwise, alert existing Pokemon health.
     *
     * @param damage Damage to deal on this Pokemon
     */
    public void damage(int damage) {
        int safeDamage = Math.max(damage, 0);
        health -= safeDamage;
        battleDamage = safeDamage;
        if (health == 0) {
            System.out.println(name + " is down!");
        } else {
            printHealth();
        }
    }

    /**
     * Heals Pokemon health by up to 20 points. Healed points also cannot exceed the damage dealt during this battle.
     * Resets battleDamage after healing.
     * Alert healed amount then alert existing Pokemon health.
     *
     * @return healed amount.
     */
    public int heal() {
        int safeHeal = Math.min(battleDamage, 20);
        health += safeHeal;
        battleDamage = 0;
        System.out.println(name + " has healed " + safeHeal + " points.");
        printHealth();
        return safeHeal;
    }

    /**
     * Print pokemon health as string representation.
     */
    public void printHealth() {
        System.out.println(name + " has " + health + " health left.");
    }

    /**
     * Get the string representation of the Pokemon including its health, attack strength, and defense strength.
     *
     * @return String representation of the Pokemon.
     */
    @Override
    public String toString() {
        return name + " with " + health + " health, " + attack + " attack strength, and " + defense + " defense strength.";
    }
}
