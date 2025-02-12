package PokemonGame.Moves.Electric;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class Thunderbolt extends Move {
    public Thunderbolt() {
        super("Thunderbolt", .9, 1, new Types[]{ELECTRIC});
    }
}
