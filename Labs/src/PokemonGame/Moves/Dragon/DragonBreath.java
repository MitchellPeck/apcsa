package PokemonGame.Moves.Dragon;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class DragonBreath extends Move {
    public DragonBreath() {
        super("Dragon Breath", .6, 1, new Types[]{DRAGON});
    }
}
