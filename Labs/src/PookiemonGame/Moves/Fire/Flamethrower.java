package PookiemonGame.Moves.Fire;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Flamethrower extends Move {
    public Flamethrower() {
        super("Flamethrower", .9, 1, new Types[]{FIRE});
    }
}
