package PokemonGame.Moves.Dragon;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class Outrage extends Move {
    public Outrage() {
        super("Outrage", 1.2, 1, new Types[]{DRAGON});
    }
}
