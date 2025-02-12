package PokemonGame.Moves.Ghost;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class ShadowBall extends Move {
    public ShadowBall() {
        super("Shadow Ball", .8, 1, new Types[]{GHOST});
    }
}
