package PookiemonGame.Moves.Flying;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class WingAttack extends Move {
    public WingAttack() {
        super("Wing Attack", .6, 1, new Types[]{FLYING});
    }
}
