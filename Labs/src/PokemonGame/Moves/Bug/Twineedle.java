package PokemonGame.Moves.Bug;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class Twineedle extends Move {
    public Twineedle() {
        super("Twineedle", .25, 1, new Types[]{BUG});
    }
}
