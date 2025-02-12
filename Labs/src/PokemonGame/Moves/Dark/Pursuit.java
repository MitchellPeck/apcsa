package PokemonGame.Moves.Dark;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class Pursuit extends Move {
    public Pursuit() {
        super("Pursuit", .6, 1, new Types[]{DARK});
    }
}
