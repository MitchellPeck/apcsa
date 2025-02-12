package PokemonGame.PokemonClasses;

import PokemonGame.Globals;
import PokemonGame.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PokemonType extends PokemonBase {
    private Types type;
    private Map<Types, Double> advantages = new HashMap<Types, Double>();
    private ArrayList<Move> moves;

    /**
     * Creates a new PokemonType instance with given type. Passes name to super constructor.
     *
     * @param type Type of the Pokemon.
     * @param name Name of the Pokemon. Passed to super constructor.
     */
    public PokemonType(Types type, String name) {
        super(name);
        this.type = type;
        this.moves = new ArrayList<Move>();
    }

    /**
     * Creates a new PokemonType instance with given type. Passes name and health to super constructor.
     *
     * @param type   Type of the Pokemon.
     * @param name   Name of the Pokemon. Passed to super constructor.
     * @param health Health of the Pokemon. Passed to super constructor.
     */
    public PokemonType(Types type, String name, int health) {
        super(name, health);
        this.type = type;
        this.moves = new ArrayList<Move>();
    }

    /**
     * Creates a new PokemonType instance with given type. Passes name, health, attack, and defense to super constructor.
     *
     * @param type    Type of the Pokemon.
     * @param name    Name of the Pokemon. Passed to super constructor.
     * @param health  Health of the Pokemon. Passed to super constructor.
     * @param attack  Attack strength of the Pokemon. Passed to super constructor.
     * @param defense Defense strength of the Pokemon. Passed to super constructor.
     */
    public PokemonType(Types type, String name, int health, int attack, int defense) {
        super(name, health, attack, defense);
        this.type = type;
        this.moves = new ArrayList<Move>();
    }

    /**
     * Creates a new PokemonType instance with given type and moves. Passes name, health, attack, and defense to super constructor.
     *
     * @param type    Type of the Pokemon.
     * @param moves   Moves that the Pokemon has.
     * @param name    Name of the Pokemon. Passed to super constructor.
     * @param health  Health of the Pokemon. Passed to super constructor.
     * @param attack  Attack strength of the Pokemon. Passed to super constructor.
     * @param defense Defense strength of the Pokemon. Passed to super constructor.
     */
    public PokemonType(Types type, Move[] moves, String name, int health, int attack, int defense) {
        super(name, health, attack, defense);
        this.type = type;
        this.moves = new ArrayList<Move>();
        this.moves.addAll(Arrays.asList(moves));
    }

    /**
     * Get the type of the Pokemon.
     *
     * @return Type of the Pokemon.
     */
    public Types getType() {
        return type;
    }

    /**
     * Set the type of the Pokemon.
     *
     * @param type Type of the Pokemon.
     */
    public void setType(Types type) {
        this.type = type;
    }

    /**
     * Get the moves that the PokemonType has.
     *
     * @return Moves that the PokemonType has.
     */
    public Move[] getMoves() {
        return (Move[]) moves.toArray();
    }

    /**
     * Add a move for the PokemonType.
     *
     * @param move Move to add for the PokemonType.
     */
    public void addMove(Move move) {
        boolean valid = false;
        for (int i=0; i<move.getTypes().length; i++) {
            if (move.getTypes()[i] == type) valid = true;
        }
        if (!valid) return;
        moves.add(move);
    }

    /**
     * Remove a move from the PokemonType.
     *
     * @param move Move to remove for the PokemonType.
     */
    public void removeMove(Move move) {
        moves.remove(move);
    }

    /**
     * Remove a move from the PokemonType.
     *
     * @param index Index of the move to remove for the PokemonType.
     */
    public void removeMove(int index) {
        moves.remove(index);
    }

    /**
     * Get the advantages that this PokemonType has over other PokemonTypes.
     *
     * @return Advantages that this PokemonType has over other PokemonTypes.
     */
    public Map<Types, Double> getAdvantages() {
        return advantages;
    }

    /**
     * Add an advantage that this PokemonType has over other PokemonTypes.
     *
     * @param type      The PokemonType that the advantage is over.
     * @param advantage The advantage over the other PokemonType.
     */
    public void setAdvantage(Types type, double advantage) {
        advantages.put(type, advantage);
    }

    /**
     * Add a disadvantage that this PokemonType has over other PokemonTypes.
     *
     * @param type         the PokemonType that the disadvantage is under.
     * @param disadvantage The disadvantage under the other PokemonType.
     */
    public void setDisadvantage(Types type, double disadvantage) {
        advantages.put(type, 1 / disadvantage);
    }

    /**
     * Get the advantage that this PokemonType has over another PokemonType.
     *
     * @param enemy The PokemonType that the advantage needs to be found for.
     * @return The advantage over the other PokemonType.
     */
    public double advantage(PokemonType enemy) {
        Types enemyType = enemy.getType();
        double advantage = advantages.get(enemyType);
        if (advantage == 0) advantage = 1;
        return advantage;
    }

    /**
     * Attack an enemy PokemonType passed as a parameter.
     * Calls super attack method to get damage.
     * Adjusts damage based on advantage over enemy PokemonType, as well as chosen Move damage multiplier and accuracy.
     *
     * @param enemy Enemy PokemonType to attack.
     * @param move Move to attack enemy PokemonType with.
     * @return Damage dealt to enemy PokemonType, with advantage factored in.
     */
    public int attack(PokemonType enemy, Move move) {
        int baseDamage = super.attack(enemy);
        double advantage = advantage(enemy);
        int advantageDamage = (int) ((baseDamage * advantage) + 0.5);
        double damageMultiplier = move.getDamageMultiplier();
        double accuracy = move.getAccuracy();
        double accuracyChance = Utils.Random.number();
        int damage = 0;
        if (accuracyChance <= accuracy) {
            damage = (int)((advantageDamage * damageMultiplier) + .5);
        }
        return damage;
    }

    /**
     * Get the string representation of the Pokemon and its type.
     *
     * @return The string representation of the Pokemon and its type.
     */
    @Override
    public String toString() {
        return type + " " + super.toString();
    }
}
