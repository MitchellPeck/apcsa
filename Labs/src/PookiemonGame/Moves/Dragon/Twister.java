package PookiemonGame.Moves.Dragon;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Twister extends Move {
    public Twister() {
        super("Twister", .4, 1, new Types[]{DRAGON});
    }
}
