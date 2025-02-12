package PokemonGame.Moves.Grass;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class VineWhip extends Move {
    public VineWhip() {
        super("Vine Whip", .45, 1, new Types[]{GRASS});
    }
}
