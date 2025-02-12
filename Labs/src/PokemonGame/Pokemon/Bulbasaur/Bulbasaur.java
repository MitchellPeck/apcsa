package PokemonGame.Pokemon.Bulbasaur;

import PokemonGame.PokemonClasses.Pokemon;
import static PokemonGame.PokemonClasses.Types.*;

public class Bulbasaur extends Pokemon {
    public Bulbasaur() {
        super(GRASS, "Bulbasaur", 45, 45, 49, 49);

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
