package PookiemonGame.Moves.Dark;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Pursuit extends Move {
    public Pursuit() {
        super("Pursuit", .6, 1, new Types[]{DARK});
    }
}
