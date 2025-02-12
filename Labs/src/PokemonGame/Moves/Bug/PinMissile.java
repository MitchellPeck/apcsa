package PokemonGame.Moves.Bug;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class PinMissile extends Move {
    public PinMissile() {
        super("Pin Missile", .25, .95, new Types[]{BUG});
    }
}
