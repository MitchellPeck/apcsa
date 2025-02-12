package PookiemonGame.Moves.Dark;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Thief extends Move {
    public Thief() {
        super("Thief", .6, 1, new Types[]{DARK});
    }
}
