package PokemonGame.Moves.Fighting;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class KarateChop extends Move {
    public KarateChop() {
        super("Karate Chop", .5, 1, new Types[]{FIGHTING});
    }
}
