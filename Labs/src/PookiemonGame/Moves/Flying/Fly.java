package PookiemonGame.Moves.Flying;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Fly extends Move {
    public Fly() {
        super("Fly", .9, .95, new Types[]{FLYING});
    }
}
