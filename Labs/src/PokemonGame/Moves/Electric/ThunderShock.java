package PokemonGame.Moves.Electric;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class ThunderShock extends Move {
    public ThunderShock() {
        super("Thunder Shock", .4, 1, new Types[]{ELECTRIC});
    }
}
