package PookiemonGame.Moves.Normal;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.NORMAL;

public class Slam extends Move {
    public Slam() {
        super("Slam", .8, .75, new Types[]{NORMAL});
    }
}
