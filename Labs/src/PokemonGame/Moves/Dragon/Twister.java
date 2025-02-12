package PokemonGame.Moves.Dragon;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class Twister extends Move {
    public Twister() {
        super("Twister", .4, 1, new Types[]{DRAGON});
    }
}
