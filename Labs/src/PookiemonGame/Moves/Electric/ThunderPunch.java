package PookiemonGame.Moves.Electric;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class ThunderPunch extends Move {
    public ThunderPunch() {
        super("Thunder Punch", .75, 1, new Types[]{ELECTRIC});
    }
}
