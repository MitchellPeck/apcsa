package PookiemonGame.Moves.Ice;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class IcePunch extends Move {
    public IcePunch() {
        super("Ice Punch", .75, 1, new Types[]{ICE});
    }
}
