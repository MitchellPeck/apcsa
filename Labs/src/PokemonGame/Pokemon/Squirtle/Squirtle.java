package PokemonGame.Pokemon.Squirtle;

import PokemonGame.PokemonClasses.Pokemon;

import static PokemonGame.PokemonClasses.Types.*;

public class Squirtle extends Pokemon {
    public Squirtle() {
        super(FIRE, "Squirtle", 43, 44, 48, 65);

        super.setDisadvantage(GRASS, 2);
        super.setDisadvantage(ELECTRIC, 2);

        super.setAdvantage(STEEL, 2);
        super.setAdvantage(FIRE, 2);
        super.setAdvantage(WATER, 2);
        super.setAdvantage(ICE, 2);
    }
}
