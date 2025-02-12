package PookiemonGame.Moves.Normal;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.NORMAL;

public class Pound extends Move {
    public Pound() {
        super("Pound", .4, 1, new Types[]{NORMAL});
    }
}
