package PokemonGame.Moves.Fighting;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class JumpKick extends Move {
    public JumpKick() {
        super("Jump Kick", 1, .95, new Types[]{FIGHTING});
    }
}
