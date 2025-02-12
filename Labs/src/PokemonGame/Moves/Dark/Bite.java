package PokemonGame.Moves.Dark;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class Bite extends Move {
    public Bite() {
        super("Bite", .6, 1, new Types[]{DARK});
    }
}
