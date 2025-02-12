package PokemonGame.Moves.Fire;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class Ember extends Move {
    public Ember() {
        super("Ember", .4, 1, new Types[]{FIRE});
    }
}
