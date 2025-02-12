package PookiemonGame.Moves.Ground;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Earthquake extends Move {
    public Earthquake() {
        super("Earthquake", 1, 1, new Types[]{GROUND});
    }
}
