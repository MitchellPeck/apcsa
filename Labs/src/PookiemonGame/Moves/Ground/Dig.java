package PookiemonGame.Moves.Ground;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Dig extends Move {
    public Dig() {
        super("Dig", .8, 1, new Types[]{GROUND});
    }
}
