package PokemonGame.Moves.Ground;

import PokemonGame.PokemonClasses.Move;
import PokemonGame.PokemonClasses.Types;

import static PokemonGame.PokemonClasses.Types.*;

public class BoneClub extends Move {
    public BoneClub() {
        super("Bone Club", .65, .85, new Types[]{GROUND});
    }
}
