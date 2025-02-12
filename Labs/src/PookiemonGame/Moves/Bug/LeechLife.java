package PookiemonGame.Moves.Bug;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class LeechLife extends Move {
    public LeechLife() {
        super("Leech Life", .80, 1, new Types[]{BUG});
    }
}
