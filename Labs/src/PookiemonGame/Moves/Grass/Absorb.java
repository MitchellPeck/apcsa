package PookiemonGame.Moves.Grass;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Absorb extends Move {
    public Absorb() {
        super("Vine Whip", .2, 1, new Types[]{GRASS});
    }
}
