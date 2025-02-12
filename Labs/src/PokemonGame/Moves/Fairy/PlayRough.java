package PokemonGame.Moves.Fairy;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class PlayRough extends Move {
    public PlayRough() {
        super("Play Rough", .9, .9, new Types[]{FAIRY});
    }
}
