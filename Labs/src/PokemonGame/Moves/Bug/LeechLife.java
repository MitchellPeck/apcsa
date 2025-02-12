package PokemonGame.Moves.Bug;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class LeechLife extends Move {
    public LeechLife() {
        super("Leech Life", .80, 1, new Types[]{BUG});
    }
}
