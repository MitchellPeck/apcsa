package PookiemonGame.Moves.Flying;

import PookiemonGame.PookiemonClasses.Move;
import PookiemonGame.PookiemonClasses.Types;

import static PookiemonGame.PookiemonClasses.Types.*;

public class Gust extends Move {
    public Gust() {
        super("Gust", .4, 1, new Types[]{FLYING});
    }
}
