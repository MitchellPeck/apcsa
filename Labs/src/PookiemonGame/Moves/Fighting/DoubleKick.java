package PookiemonGame.Moves.Fighting;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class DoubleKick extends Move {
    public DoubleKick() {
        super("Double Kick", .3, 1, new Types[]{FIGHTING});
    }
}
