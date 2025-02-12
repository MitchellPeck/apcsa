package PokemonGame.Moves.Electric;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class ThunderPunch extends Move {
    public ThunderPunch() {
        super("Thunder Punch", .75, 1, new Types[]{ELECTRIC});
    }
}
