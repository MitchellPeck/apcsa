package PokemonGame.Moves.Ghost;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class Lick extends Move {
    public Lick() {
        super("Lick", .3, 1, new Types[]{GHOST});
    }
}
