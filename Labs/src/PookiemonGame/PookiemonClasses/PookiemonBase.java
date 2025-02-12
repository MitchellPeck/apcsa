package PookiemonGame.PookiemonClasses;

public class PookiemonBase {
    private String name;
    private int health;
    private int attack;
    private int defense;
    private int battleDamage;
    private Pookiemon evolution;

    /**
     * Creates a new PookiemonBase instance with given name and default health, attack, and defense.
     *
     * @param name Name of the PookiemonBase.
     */
    public PookiemonBase(String name) {
        this.name = name;
        this.health = 10;
        this.attack = 2;
        this.defense = 2;
    }

    /**
     * Creates a new PookiemonBase instance with given name and health and default attack and defense.
     *
     * @param name   Name of the PookiemonBase.
     * @param health Starting health of the PookiemonBase.
     */
    public PookiemonBase(String name, int health) {
        this.name = name;
        this.health = health;
        this.attack = 2;
        this.defense = 2;
    }

    /**
     * Creates a new PookiemonBase instance with given name, health, attack, and defense.
     *
     * @param name    Name of the PookiemonBase.
     * @param health  Starting health of the PookiemonBase.
     * @param attack  Attack strength of the PookiemonBase.
     * @param defense Defense strength of the PookiemonBase.
     */
    public PookiemonBase(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    /**
     * Creates a new PookiemonBase instance with given name, health, attack, defense, and Pookiemon to evolve to.
     *
     * @param name      Name of the PookiemonBase.
     * @param health    Starting health of the PookiemonBase.
     * @param attack    Attack strength of the PookiemonBase.
     * @param defense   Defense strength of the PookiemonBase.
     * @param evolution Pookiemon to evolve to.
     */
    public PookiemonBase(String name, int health, int attack, int defense, Pookiemon evolution) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.evolution = evolution;
    }

    /**
     * Get the name of the PookiemonBase.
     *
     * @return Name of the PookiemonBase.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the PookiemonBase.
     *
     * @param name Name of the PookiemonBase.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the health of the PookiemonBase.
     *
     * @return Health of the PookiemonBase.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Set the health of the PookiemonBase.
     *
     * @param health Health of the PookiemonBase.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Get the attack strength of the PookiemonBase.
     *
     * @return Attack strength of the PookiemonBase.
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Set the attack strength of the PookiemonBase.
     *
     * @param attack Attack strength of the PookiemonBase.
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * Get the defense strength of the PookiemonBase.
     *
     * @return Defense strength of the PookiemonBase.
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Set the defense strength of the PookiemonBase.
     *
     * @param defense Defense strength of the PookiemonBase.
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * Get the evolution Pookiemon.
     *
     * @return The evolution Pookiemon.
     */
    public Pookiemon getEvolution() {
        return evolution;
    }

    /**
     * Set the evolution Pookiemon.
     *
     * @param evolution The evolution Pookiemon.
     */
    public void setEvolution(Pookiemon evolution) {
        this.evolution = evolution;
    }

    /**
     * Attack an enemy PookiemonBase passed as a parameter.
     * Damage is random number between 1 and the difference between this Pookiemon Base's attack strength and the enemy Pookiemon Base's defense strength.
     *
     * @param enemy Enemy Pookiemon to attack.
     * @return Damage dealt to enemy PookiemonBase.
     */
    public int attack(PookiemonBase enemy) {
        int enemyDefense = enemy.getDefense();
        int attackDifference = attack - enemyDefense;
        int damage = (int) (Math.random() * attackDifference + 1);
        return damage;
    }

    /**
     * Adjusts health based on given damage value. Health minimum is 0.
     * Stores dealt damage in battleDamage variable for use in heal() method.
     * If health is 0 after damage, alert that this Pookiemon is down.
     * Otherwise, alert existing Pookiemon health.
     *
     * @param damage Damage to deal on this Pookiemon
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
     * Heals Pookiemon health by up to 20 points. Healed points also cannot exceed the damage dealt during this battle.
     * Resets battleDamage after healing.
     * Alert healed amount then alert existing Pookiemon health.
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
     * Print Pookiemon health as string representation.
     */
    public void printHealth() {
        System.out.println(name + " has " + health + " health left.");
    }

    /**
     * Evolves current PookiemonBase to represent evolution PookiemonBase values.
     */
    public void evolve() {
        if (getEvolution() == null) return;
        this.name = evolution.getName();
        this.health = evolution.getHealth();
        this.attack = evolution.getAttack();
        this.defense = evolution.getDefense();
        this.evolution = evolution.getEvolution();
    }

    /**
     * Get the string representation of the Pookiemon including its health, attack strength, and defense strength.
     *
     * @return String representation of the PookiemonBase.
     */
    @Override
    public String toString() {
        return name + " with " + health + " health, " + attack + " attack strength, and " + defense + " defense strength.";
    }
}
