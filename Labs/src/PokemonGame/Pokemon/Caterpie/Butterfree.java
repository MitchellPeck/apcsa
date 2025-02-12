package PokemonGame.Pokemon.Caterpie;

import PokemonGame.PokemonClasses.Pokemon;

import static PokemonGame.PokemonClasses.Types.*;

public class Butterfree extends Pokemon {
    public Butterfree() {
        super(FIRE, "Butterfree", 70, 60, 45, 50);

        super.setDisadvantage(FLYING, 2);
        super.setDisadvantage(ROCK, 4);
        super.setDisadvantage(FIRE, 2);
        super.setDisadvantage(ELECTRIC, 2);
        super.setDisadvantage(ICE, 2);

        super.setAdvantage(FIGHTING, 4);
        super.setAdvantage(BUG, 2);
        super.setAdvantage(GRASS, 4);
    }
}
