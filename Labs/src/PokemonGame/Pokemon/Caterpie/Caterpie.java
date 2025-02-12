package PokemonGame.Pokemon.Caterpie;

import PokemonGame.PokemonClasses.Pokemon;

import static PokemonGame.PokemonClasses.Types.*;

public class Caterpie extends Pokemon {
    public Caterpie() {
        super(FIRE, "Caterpie", 45, 45, 30, 35);

        super.setDisadvantage(FLYING, 2);
        super.setDisadvantage(ROCK, 2);
        super.setDisadvantage(FIRE, 2);

        super.setAdvantage(FIGHTING, 2);
        super.setAdvantage(GROUND, 2);
        super.setAdvantage(GRASS, 2);
    }
}
