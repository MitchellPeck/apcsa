package PookiemonGame.PlayerClasses;

import PookiemonGame.PookiemonClasses.Pookiemon;

import java.util.ArrayList;
import java.util.Arrays;

public class Player {
    private String name;
    private boolean human;
    private ArrayList<Pookiemon> Pookiemon;
    private Pookiemon selectedPookiemon;
    private int wins;

    /**
     * Creates a new Player instance with given name and human status.
     *
     * @param name  Name of the Player.
     * @param human Human status of the Player.
     */
    public Player(String name, boolean human) {
        this.name = name;
        this.human = human;
        this.Pookiemon = new ArrayList<Pookiemon>(5);
    }

    /**
     * Creates a new Player instance with given name, human status, and starting Pookiemon.
     *
     * @param name      Name of the Player.
     * @param human     Human status of the Player.
     * @param Pookiemon Starting Pookiemon for the Player.
     */
    public Player(String name, boolean human, Pookiemon[] Pookiemon) {
        this.name = name;
        this.human = human;
        this.Pookiemon = new ArrayList<Pookiemon>(55);
        this.Pookiemon.addAll(Arrays.asList(Pookiemon));
    }

    /**
     * Creates a new player instance with given name, human status, starting Pookiemon, and starting selected Pookiemon.
     *
     * @param name              Name of the Player.
     * @param human             Human status of the Player.
     * @param Pookiemon         Starting Pookiemon for the Player.
     * @param selectedPookiemon Starting selected Pookiemon for the Player.
     */
    public Player(String name, boolean human, Pookiemon[] Pookiemon, Pookiemon selectedPookiemon) {
        this.name = name;
        this.human = human;
        this.Pookiemon = new ArrayList<Pookiemon>(5);
        this.Pookiemon.addAll(Arrays.asList(Pookiemon));
        this.selectedPookiemon = selectedPookiemon;
    }

    /**
     * Get the name of the Player.
     *
     * @return Name of the Player.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the Player.
     *
     * @param name Name of the player.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the human status of the Player.
     *
     * @return Human status of the Player.
     */
    public boolean getHuman() {
        return human;
    }

    /**
     * Set the human status of the Player.
     *
     * @param human Human status of the Player.
     */
    public void setHuman(boolean human) {
        this.human = human;
    }

    /**
     * Get Pookiemon for the Player.
     *
     * @return Pookiemon for the Player.
     */
    public Pookiemon[] getPookiemon() {
        return (Pookiemon[]) Pookiemon.toArray();
    }

    /**
     * Add Pookiemon to the Player.
     * Skips adding five Pookiemon are already in list.
     *
     * @param Pookiemon Pookiemon to add to the Player.
     */
    public void addPookiemon(Pookiemon Pookiemon) {
        if (this.Pookiemon.size() >= 5) return;
        this.Pookiemon.add(Pookiemon);
    }

    /**
     * Remove Pookiemon from the Player.
     *
     * @param Pookiemon Pookiemon to remove from the player.
     */
    public void removePookiemon(Pookiemon Pookiemon) {
        this.Pookiemon.remove(Pookiemon);
    }

    /**
     * Remove Pookiemon from the Player.
     *
     * @param index Index of Pookiemon to remove from the Player.
     */
    public void removePookiemon(int index) {
        if (index < 0 || index > Pookiemon.size()) return;
        this.Pookiemon.remove(index);
    }

    /**
     * Set selected Pookiemon for the Player.
     *
     * @param index Index of Pookiemon to set as selected for the Player.
     */
    public void selectPookiemon(int index) {
        if (index < 0 || index > Pookiemon.size()) return;
        this.selectedPookiemon = this.Pookiemon.get(index);
    }

    /**
     * Get the wins that this Player has gotten.
     *
     * @return The wins that this Player has gotten.
     */
    public int getWins() {
        return wins;
    }

    /**
     * Set the wins that this Player has gotten.
     *
     * @param wins The wins that this Player has gotten.
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    /**
     * Add a win to this Player.
     */
    public void addWin() {
        this.wins++;
    }
}
