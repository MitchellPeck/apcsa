package PookiemonGame.Moves.Normal;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.NORMAL;

public class MegaPunch extends Move {
    public MegaPunch() {
        super("Mega Punch", .8, .85, new Types[]{NORMAL});
    }
}
