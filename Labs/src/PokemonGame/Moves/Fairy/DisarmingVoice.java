package PokemonGame.Moves.Fairy;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class DisarmingVoice extends Move {
    public DisarmingVoice() {
        super("Disarming Voice", .4, 1, new Types[]{FAIRY});
    }
}
