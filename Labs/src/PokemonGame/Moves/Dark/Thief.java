package PokemonGame.Moves.Dark;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class Thief extends Move {
    public Thief() {
        super("Thief", .6, 1, new Types[]{DARK});
    }
}
