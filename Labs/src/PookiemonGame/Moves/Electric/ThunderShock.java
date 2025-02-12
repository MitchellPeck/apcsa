package PookiemonGame.Moves.Electric;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class ThunderShock extends Move {
    public ThunderShock() {
        super("Thunder Shock", .4, 1, new Types[]{ELECTRIC});
    }
}
