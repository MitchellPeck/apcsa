package PookiemonGame.Moves.Bug;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class PinMissile extends Move {
    public PinMissile() {
        super("Pin Missile", .25, .95, new Types[]{BUG});
    }
}
