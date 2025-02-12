package PookiemonGame.Moves.Normal;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.NORMAL;

public class ViseGrip extends Move {
    public ViseGrip() {
        super("Vise Grip", .55, 1, new Types[]{NORMAL});
    }
}
