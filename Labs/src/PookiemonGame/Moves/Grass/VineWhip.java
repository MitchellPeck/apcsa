package PookiemonGame.Moves.Grass;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class VineWhip extends Move {
    public VineWhip() {
        super("Vine Whip", .45, 1, new Types[]{GRASS});
    }
}
