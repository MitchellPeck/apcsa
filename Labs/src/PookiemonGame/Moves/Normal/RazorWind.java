package PookiemonGame.Moves.Normal;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.NORMAL;

public class RazorWind extends Move {
    public RazorWind() {
        super("Razor Wind", .8, 1, new Types[]{NORMAL});
    }
}
