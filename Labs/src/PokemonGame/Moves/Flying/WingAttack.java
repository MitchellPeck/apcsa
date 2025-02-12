package PokemonGame.Moves.Flying;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class WingAttack extends Move {
    public WingAttack() {
        super("Wing Attack", .6, 1, new Types[]{FLYING});
    }
}
