package PokemonGame.Pokemon.Bulbasaur;

import PokemonGame.PokemonClasses.Pokemon;

import static PokemonGame.PokemonClasses.Types.*;

public class Venusaur extends Pokemon {
    public Venusaur() {
        super(GRASS, "Venusaur", 80, 80, 82, 83);

        super.setDisadvantage(FLYING, 2);
        super.setDisadvantage(FIRE, 2);
        super.setDisadvantage(PSYCHIC, 2);
        super.setDisadvantage(ICE, 2);

        super.setAdvantage(FIGHTING, 2);
        super.setAdvantage(WATER, 2);
        super.setAdvantage(GRASS, 4);
        super.setAdvantage(ELECTRIC, 2);
        super.setAdvantage(FAIRY, 2);
    }
}
