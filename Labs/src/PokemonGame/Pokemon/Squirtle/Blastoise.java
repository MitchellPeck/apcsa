package PokemonGame.Pokemon.Squirtle;

import PokemonGame.PokemonClasses.Pokemon;

import static PokemonGame.PokemonClasses.Types.*;

public class Blastoise extends Pokemon {
    public Blastoise() {
        super(FIRE, "Blastoise", 78, 79, 83, 100);

        super.setDisadvantage(GRASS, 2);
        super.setDisadvantage(ELECTRIC, 2);

        super.setAdvantage(STEEL, 2);
        super.setAdvantage(FIRE, 2);
        super.setAdvantage(WATER, 2);
        super.setAdvantage(ICE, 2);
    }
}
