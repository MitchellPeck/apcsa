package PokemonGame.Pokemon.Caterpie;

import PokemonGame.PokemonClasses.Pokemon;

import static PokemonGame.PokemonClasses.Types.*;

public class Metapod extends Pokemon {
    public Metapod() {
        super(FIRE, "Metapod", 30, 50, 20, 55);

        super.setDisadvantage(FLYING, 2);
        super.setDisadvantage(ROCK, 2);
        super.setDisadvantage(FIRE, 2);

        super.setAdvantage(FIGHTING, 2);
        super.setAdvantage(GROUND, 2);
        super.setAdvantage(GRASS, 2);
    }
}
