package PookiemonGame.Moves.Normal;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.NORMAL;

public class DoubleSlap extends Move {
    public DoubleSlap() {
        super("Double Slap", .15, .85, new Types[]{NORMAL});
    }
}
