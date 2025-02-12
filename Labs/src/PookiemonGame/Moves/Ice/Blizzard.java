package PookiemonGame.Moves.Ice;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Blizzard extends Move {
    public Blizzard() {
        super("Ice Punch", 1.1, .7, new Types[]{ICE});
    }
}
