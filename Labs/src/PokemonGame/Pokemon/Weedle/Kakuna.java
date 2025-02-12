package PokemonGame.Pokemon.Weedle;

import PokemonGame.PokemonClasses.Pokemon;

import static PokemonGame.PokemonClasses.Types.*;

public class Kakuna extends Pokemon {
    public Kakuna() {
        super(FIRE, "Kakuna", 35, 45, 25, 50);

        super.setDisadvantage(FLYING, 2);
        super.setDisadvantage(ROCK, 2);
        super.setDisadvantage(FIRE, 2);
        super.setDisadvantage(PSYCHIC, 2);

        super.setAdvantage(FIGHTING, 4);
        super.setAdvantage(POISON, 2);
        super.setAdvantage(BUG, 2);
        super.setAdvantage(GRASS, 4);
        super.setAdvantage(FAIRY, 2);
    }
}
