package PookiemonGame.Moves.Ghost;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class ShadowBall extends Move {
    public ShadowBall() {
        super("Shadow Ball", .8, 1, new Types[]{GHOST});
    }
}
