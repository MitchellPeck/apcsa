package PookiemonGame.Moves.Fire;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Ember extends Move {
    public Ember() {
        super("Ember", .4, 1, new Types[]{FIRE});
    }
}
