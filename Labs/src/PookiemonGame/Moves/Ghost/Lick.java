package PookiemonGame.Moves.Ghost;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Lick extends Move {
    public Lick() {
        super("Lick", .3, 1, new Types[]{GHOST});
    }
}
