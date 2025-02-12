package PookiemonGame.Moves.Normal;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.NORMAL;

public class Cut extends Move {
    public Cut() {
        super("Cut", .5, .95, new Types[]{NORMAL});
    }
}
