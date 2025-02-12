package PookiemonGame.Moves.Fairy;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class PlayRough extends Move {
    public PlayRough() {
        super("Play Rough", .9, .9, new Types[]{FAIRY});
    }
}
