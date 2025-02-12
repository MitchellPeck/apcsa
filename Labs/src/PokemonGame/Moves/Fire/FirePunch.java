package PokemonGame.Moves.Fire;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class FirePunch extends Move {
    public FirePunch() {
        super("Fire Punch", .75, 1, new Types[]{FIRE});
    }
}
