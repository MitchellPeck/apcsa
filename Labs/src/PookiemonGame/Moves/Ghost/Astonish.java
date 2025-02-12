package PookiemonGame.Moves.Ghost;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Astonish extends Move {
    public Astonish() {
        super("Astonish", .3, 1, new Types[]{GHOST});
    }
}
