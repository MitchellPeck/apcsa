package PokemonGame.Moves.Fire;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class Flamethrower extends Move {
    public Flamethrower() {
        super("Flamethrower", .9, 1, new Types[]{FIRE});
    }
}
