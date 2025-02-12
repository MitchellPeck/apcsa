package PokemonGame.Moves.Ghost;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class Astonish extends Move {
    public Astonish() {
        super("Astonish", .3, 1, new Types[]{GHOST});
    }
}
