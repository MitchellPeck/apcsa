package PookiemonGame.PookiemonClasses;

import PookiemonGame.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PookiemonType extends PookiemonBase {
    private Types type;
    private Map<Types, Double> advantages = new HashMap<Types, Double>();
    private ArrayList<Move> moves;

    /**
     * Creates a new PookiemonType instance with given type. Passes name to super constructor.
     *
     * @param type Type of the Pookiemon.
     * @param name Name of the Pookiemon. Passed to super constructor.
     */
    public PookiemonType(Types type, String name) {
        super(name);
        this.type = type;
        this.moves = new ArrayList<Move>();
    }

    /**
     * Creates a new PookiemonType instance with given type. Passes name and health to super constructor.
     *
     * @param type   Type of the Pookiemon.
     * @param name   Name of the Pookiemon. Passed to super constructor.
     * @param health Health of the Pookiemon. Passed to super constructor.
     */
    public PookiemonType(Types type, String name, int health) {
        super(name, health);
        this.type = type;
        this.moves = new ArrayList<Move>();
    }

    /**
     * Creates a new PookiemonType instance with given type. Passes name, health, attack, and defense to super constructor.
     *
     * @param type    Type of the Pookiemon.
     * @param name    Name of the Pookiemon. Passed to super constructor.
     * @param health  Health of the Pookiemon. Passed to super constructor.
     * @param attack  Attack strength of the Pookiemon. Passed to super constructor.
     * @param defense Defense strength of the Pookiemon. Passed to super constructor.
     */
    public PookiemonType(Types type, String name, int health, int attack, int defense) {
        super(name, health, attack, defense);
        this.type = type;
        this.moves = new ArrayList<Move>();
    }

    /**
     * Creates a new PookiemonType instance with given type and moves. Passes name, health, attack, and defense to super constructor.
     *
     * @param type    Type of the Pookiemon.
     * @param moves   Moves that the Pookiemon has.
     * @param name    Name of the Pookiemon. Passed to super constructor.
     * @param health  Health of the Pookiemon. Passed to super constructor.
     * @param attack  Attack strength of the Pookiemon. Passed to super constructor.
     * @param defense Defense strength of the Pookiemon. Passed to super constructor.
     */
    public PookiemonType(Types type, Move[] moves, String name, int health, int attack, int defense) {
        super(name, health, attack, defense);
        this.type = type;
        this.moves = new ArrayList<Move>();
        this.moves.addAll(Arrays.asList(moves));
    }

    /**
     * Creates a new PookiemonType instance with given type and moves. Passes name, health, attack, defense, and evolution to super constructor.
     *
     * @param type      Type of the Pookiemon.
     * @param moves     Moves that the Pookiemon has.
     * @param name      Name of the Pookiemon. Passed to super constructor.
     * @param health    Health of the Pookiemon. Passed to super constructor.
     * @param attack    Attack strength of the Pookiemon. Passed to super constructor.
     * @param defense   Defense strength of the Pookiemon. Passed to super constructor.
     * @param evolution Pookiemon to evolve to. Passed to super constructor.
     */
    public PookiemonType(Types type, Move[] moves, String name, int health, int attack, int defense, Pookiemon evolution) {
        super(name, health, attack, defense, evolution);
        this.type = type;
        this.moves = new ArrayList<Move>();
        this.moves.addAll(Arrays.asList(moves));
    }

    /**
     * Get the type of the Pookiemon.
     *
     * @return Type of the Pookiemon.
     */
    public Types getType() {
        return type;
    }

    /**
     * Set the type of the Pookiemon.
     *
     * @param type Type of the Pookiemon.
     */
    public void setType(Types type) {
        this.type = type;
    }

    /**
     * Get the moves that the PookiemonType has.
     *
     * @return Moves that the PookiemonType has.
     */
    public Move[] getMoves() {
        return (Move[]) moves.toArray();
    }

    /**
     * Get the moves that the PookiemonType has, as the original ArrayList.
     *
     * @return Moves that the PookiemonType has, as the original ArrayList.
     */
    public ArrayList<Move> getMovesAsArrayList() {
        return moves;
    }

    /**
     * Add a move for the PookiemonType.
     *
     * @param move Move to add for the PookiemonType.
     */
    public void addMove(Move move) {
        boolean valid = false;
        int count = 0;
        while (!valid && count < move.getTypes().length) {
            if (move.getTypes()[count] == type) valid = true;
            else if (move.getTypes()[count] == Types.NORMAL) valid = true;
            else count++;
        }
        if (!valid) return;
        moves.add(move);
    }

    /**
     * Remove a move from the PookiemonType.
     *
     * @param move Move to remove for the PookiemonType.
     */
    public void removeMove(Move move) {
        moves.remove(move);
    }

    /**
     * Remove a move from the PookiemonType.
     *
     * @param index Index of the move to remove for the PookiemonType.
     */
    public void removeMove(int index) {
        moves.remove(index);
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
     * @param type         the PookiemonType that the disadvantage is under.
     * @param disadvantage The disadvantage under the other PookiemonType.
     */
    public void setDisadvantage(Types type, double disadvantage) {
        advantages.put(type, 1 / disadvantage);
    }

    /**
     * Get the advantage that this PookiemonType has over another PookiemonType.
     *
     * @param enemy The PookiemonType that the advantage needs to be found for.
     * @return The advantage over the other PookiemonType.
     */
    public double advantage(PookiemonType enemy) {
        Types enemyType = enemy.getType();
        double advantage = advantages.get(enemyType);
        if (advantage == 0) advantage = 1;
        return advantage;
    }

    /**
     * Attack an enemy PookiemonType passed as a parameter.
     * Calls super attack method to get damage.
     * Adjusts damage based on advantage over enemy PookiemonType, as well as chosen Move damage multiplier and accuracy.
     *
     * @param enemy Enemy PookiemonType to attack.
     * @param move  Move to attack enemy PookiemonType with.
     * @return Damage dealt to enemy PookiemonType, with advantage factored in.
     */
    public int attack(PookiemonType enemy, Move move) {
        int baseDamage = super.attack(enemy);
        double advantage = advantage(enemy);
        int advantageDamage = (int) ((baseDamage * advantage) + 0.5);
        double damageMultiplier = move.getDamageMultiplier();
        double accuracy = move.getAccuracy();
        double accuracyChance = Utils.Random.number();
        int damage = 0;
        if (accuracyChance <= accuracy) {
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
        this.type = getEvolution().getType();
        this.advantages = getEvolution().getAdvantages();
        this.moves.addAll(getEvolution().getMovesAsArrayList());
        ArrayList<Move> newList = new ArrayList<>();
        for (Move element : moves) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        moves = newList;
        super.evolve();
    }

    /**
     * Get the string representation of the Pookiemon and its type.
     *
     * @return The string representation of the Pookiemon and its type.
     */
    @Override
    public String toString() {
        return type + " " + super.toString();
    }
}
