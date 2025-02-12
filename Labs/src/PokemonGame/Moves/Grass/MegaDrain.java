package PokemonGame.Moves.Grass;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class MegaDrain extends Move {
    public MegaDrain() {
        super("Mega Drain", .4, 1, new Types[]{GRASS});
    }
}
