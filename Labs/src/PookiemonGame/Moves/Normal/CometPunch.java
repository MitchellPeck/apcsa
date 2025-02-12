package PookiemonGame.Moves.Normal;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.NORMAL;

public class CometPunch extends Move {
    public CometPunch() {
        super("Comet Punch", .18, .85, new Types[]{NORMAL});
    }
}
