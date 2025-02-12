package PokemonGame.Moves.Flying;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class Gust extends Move {
    public Gust() {
        super("Gust", .4, 1, new Types[]{FLYING});
    }
}
