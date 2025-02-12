package PookiemonGame.Moves.Ice;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class IceBeam extends Move {
    public IceBeam() {
        super("Ice Beam", .9, 1, new Types[]{ICE});
    }
}
