package PokemonGame.Moves.Grass;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class Absorb extends Move {
    public Absorb() {
        super("Vine Whip", .2, 1, new Types[]{GRASS});
    }
}
