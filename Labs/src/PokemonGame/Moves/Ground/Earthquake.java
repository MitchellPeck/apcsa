package PokemonGame.Moves.Ground;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class Earthquake extends Move {
    public Earthquake() {
        super("Earthquake", 1, 1, new Types[]{GROUND});
    }
}
