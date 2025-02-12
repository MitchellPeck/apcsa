package PookiemonGame.Moves.Electric;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Thunderbolt extends Move {
    public Thunderbolt() {
        super("Thunderbolt", .9, 1, new Types[]{ELECTRIC});
    }
}
