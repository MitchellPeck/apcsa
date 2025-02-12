package PokemonGame.Moves.Ground;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class Dig extends Move {
    public Dig() {
        super("Dig", .8, 1, new Types[]{GROUND});
    }
}
