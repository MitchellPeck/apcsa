package PokemonGame;

import PokemonGame.PokemonClasses.Pokemon;

import java.util.ArrayList;
import java.util.Arrays;

public class Player {
    private String name;
    private boolean human;
    private ArrayList<Pokemon> pokemon;
    private Pokemon selectedPokemon;

    /**
     * Creates a new Player instance with given name and human status.
     *
     * @param name  Name of the Player.
     * @param human Human status of the Player.
     */
    public Player(String name, boolean human) {
        this.name = name;
        this.human = human;
        this.pokemon = new ArrayList<Pokemon>(5);
    }

    /**
     * Creates a new Player instance with given name, human status, and starting Pokemon.
     *
     * @param name    Name of the Player.
     * @param human   Human status of the Player.
     * @param pokemon Starting Pokemon for the Player.
     */
    public Player(String name, boolean human, Pokemon[] pokemon) {
        this.name = name;
        this.human = human;
        this.pokemon = new ArrayList<Pokemon>(55);
        this.pokemon.addAll(Arrays.asList(pokemon));
    }

    /**
     * Creates a new player instance with given name, human status, starting Pokemon, and starting selected Pokemon.
     *
     * @param name            Name of the Player.
     * @param human           Human status of the Player.
     * @param pokemon         Starting Pokemon for the Player.
     * @param selectedPokemon Starting selected Pokemon for the Player.
     */
    public Player(String name, boolean human, Pokemon[] pokemon, Pokemon selectedPokemon) {
        this.name = name;
        this.human = human;
        this.pokemon = new ArrayList<Pokemon>(5);
        this.pokemon.addAll(Arrays.asList(pokemon));
        this.selectedPokemon = selectedPokemon;
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
     * Get Pokemon for the Player.
     *
     * @return Pokemon for the Player.
     */
    public Pokemon[] getPokemon() {
        return (Pokemon[]) pokemon.toArray();
    }

    /**
     * Add Pokemon to the Player.
     * Skips adding five Pokemon are already in list.
     *
     * @param pokemon Pokemon to add to the Player.
     */
    public void addPokemon(Pokemon pokemon) {
        if (this.pokemon.size() >= 5) return;
        this.pokemon.add(pokemon);
    }

    /**
     * Remove Pokemon from the Player.
     *
     * @param pokemon Pokemon to remove from the player.
     */
    public void removePokemon(Pokemon pokemon) {
        this.pokemon.remove(pokemon);
    }

    /**
     * Remove Pokemon from the Player.
     *
     * @param index Index of Pokemon to remove from the Player.
     */
    public void removePokemon(int index) {
        if (index < 0 || index > pokemon.size()) return;
        this.pokemon.remove(index);
    }

    /**
     * Set selected Pokemon for the Player.
     *
     * @param index Index of Pokemon to set as selected for the Player.
     */
    public void selectPokemon(int index) {
        if (index < 0 || index > pokemon.size()) return;
        this.selectedPokemon = this.pokemon.get(index);
    }
}
