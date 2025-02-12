package PokemonGame.Pokemon.Charmander;

import PokemonGame.PokemonClasses.Pokemon;

import static PokemonGame.PokemonClasses.Types.*;

public class Charmander extends Pokemon {
    public Charmander() {
        super(FIRE, "Charmander", 65, 39, 52, 43);

        super.setDisadvantage(GROUND, 2);
        super.setDisadvantage(ROCK, 2);
        super.setDisadvantage(WATER, 2);

        super.setAdvantage(BUG, 2);
        super.setAdvantage(STEEL, 2);
        super.setAdvantage(FIRE, 2);
        super.setAdvantage(GRASS, 2);
        super.setAdvantage(ICE, 2);
        super.setAdvantage(FAIRY, 2);
    }
}
