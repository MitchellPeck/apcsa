package PokemonGame.Moves.Flying;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class Fly extends Move {
    public Fly() {
        super("Fly", .9, .95, new Types[]{FLYING});
    }
}
