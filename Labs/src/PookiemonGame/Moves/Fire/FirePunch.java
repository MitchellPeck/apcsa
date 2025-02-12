package PookiemonGame.Moves.Fire;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class FirePunch extends Move {
    public FirePunch() {
        super("Fire Punch", .75, 1, new Types[]{FIRE});
    }
}
