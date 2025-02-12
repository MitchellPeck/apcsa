package PokemonGame.Moves.Fighting;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class DoubleKick extends Move {
    public DoubleKick() {
        super("Double Kick", .3, 1, new Types[]{FIGHTING});
    }
}
